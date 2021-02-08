package io.pivotal.workshop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "io.pivotal.workshop.repository,io.pivotal.workshop.service")
public class ProductConfig {
	
	
}
