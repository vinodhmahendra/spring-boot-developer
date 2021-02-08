package io.pivotal.workshop.service;

import java.util.List;

import io.pivotal.workshop.model.Product;

public interface ProductService {
	
	
	List<Product> retrieveAllProducts();

}
