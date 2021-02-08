package io.pivotal.workshop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.pivotal.workshop.config.ProductConfig;
import io.pivotal.workshop.service.ProductService;

public class ProductApplication {

	public static void main(String[] args) {
		
		ApplicationContext springcontainer = new AnnotationConfigApplicationContext(ProductConfig.class);
		
		ProductService productService = springcontainer.getBean("productService", ProductService.class);
		
		productService.retrieveAllProducts().forEach(product -> System.out.println(product.getName()));
		 
	}

}
