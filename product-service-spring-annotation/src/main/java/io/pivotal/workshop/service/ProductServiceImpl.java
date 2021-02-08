package io.pivotal.workshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.pivotal.workshop.model.Product;
import io.pivotal.workshop.repository.ProductRepository;

@Service(value = "productService")
public class ProductServiceImpl implements ProductService {
	
	private ProductRepository productRepository ;
	
	
	
	@Autowired	
	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public List<Product> retrieveAllProducts() {
		return productRepository.findAllProducts();
	}

}
