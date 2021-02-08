package io.pivotal.workshop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.pivotal.workshop.service.ProductService;

public class ProductApplication {

	public static void main(String[] args) {
		
		ApplicationContext springcontainer = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		ProductService productService = springcontainer.getBean("productService", ProductService.class);
		
		productService.retrieveAllProducts().forEach(product -> System.out.println(product.getName()));
		 
	}

}
