package io.pivotal.workshop.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import io.pivotal.workshop.model.Product;

public class InMemoryProductRepositoryImpl implements ProductRepository {

	private static List<Product> productlist = new ArrayList<Product>();
	
	static {
		productlist.add(new Product(1, "HP Laptop ABC",new BigDecimal(25678.99), new Date()));
		productlist.add(new Product(2, "Acer Laptop ABC",new BigDecimal(29678.99), new Date()));
		productlist.add(new Product(3, "Lenova Laptop ABC",new BigDecimal(30678.99), new Date()));
	}
	
	
	@Override
	public List<Product> findAllProducts(){
		return productlist;
	}
}
