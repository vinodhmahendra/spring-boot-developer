package io.pivotal.workshop.model;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
	
	private Integer id;
	private String name;
	private BigDecimal price;
	private Date itemAdded;
	
	
	public Product() {
		super();
	}


	public Product(Integer id, String name, BigDecimal price, Date itemAdded) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.itemAdded = itemAdded;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public BigDecimal getPrice() {
		return price;
	}


	public void setPrice(BigDecimal price) {
		this.price = price;
	}


	public Date getItemAdded() {
		return itemAdded;
	}


	public void setItemAdded(Date itemAdded) {
		this.itemAdded = itemAdded;
	}


	@Override
	public String toString() {
		return String.format("Product [id=%s, name=%s, price=%s, itemAdded=%s]", id, name, price, itemAdded);
	}

}
