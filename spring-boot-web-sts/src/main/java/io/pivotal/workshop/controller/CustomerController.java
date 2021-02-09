package io.pivotal.workshop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.pivotal.workshop.model.Customer;

@RestController
public class CustomerController {
	
	@RequestMapping(path = "/" , method = RequestMethod.GET)
	public Customer retrieveCustomer() {
		return new Customer("vinodh", "1234567890","vinodh@pivotal.io");
	}

}
