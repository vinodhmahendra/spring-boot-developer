package io.pivotal.workshop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.pivotal.workshop.repository.InMemoryProductRepositoryImpl;
import io.pivotal.workshop.repository.ProductRepository;
import io.pivotal.workshop.service.ProductService;
import io.pivotal.workshop.service.ProductServiceImpl;

@Configuration
public class ProductConfig {
	
	@Bean
	public ProductRepository productRepository() {
		return new InMemoryProductRepositoryImpl();
	}
	
	@Bean
	public ProductService productService() {
		ProductServiceImpl productService = new ProductServiceImpl();
		productService.setProductRepository(productRepository());
		return productService;
	}
}
