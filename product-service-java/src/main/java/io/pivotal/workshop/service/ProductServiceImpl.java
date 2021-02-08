package io.pivotal.workshop.service;

import java.util.List;

import io.pivotal.workshop.model.Product;
import io.pivotal.workshop.repository.InMemoryProductRepositoryImpl;
import io.pivotal.workshop.repository.ProductRepository;

public class ProductServiceImpl implements ProductService {
	
	private ProductRepository productRepository = new InMemoryProductRepositoryImpl();
	

	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public List<Product> retrieveAllProducts() {
		return productRepository.findAllProducts();
	}

}
