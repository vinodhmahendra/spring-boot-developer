package io.pivotal.workshop;

import io.pivotal.workshop.service.ProductService;
import io.pivotal.workshop.service.ProductServiceImpl;

public class ProductApplication {

	public static void main(String[] args) {
		
		ProductService productService = new ProductServiceImpl();
		
		productService.retrieveAllProducts().forEach(product -> System.out.println(product.getName()));
		 
	}

}
