package io.pivotal.workshop.repository;

import java.util.List;

import io.pivotal.workshop.model.Product;

public interface ProductRepository {

	List<Product> findAllProducts();

}