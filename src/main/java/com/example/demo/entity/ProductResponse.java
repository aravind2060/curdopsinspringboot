package com.example.demo.entity;

import java.util.List;

public class ProductResponse {

	private List<ProductEntity> products;

	public ProductResponse(List<ProductEntity> products) {
		super();
		this.products = products;
	}

	public List<ProductEntity> getProducts() {
		return products;
	}

	public void setProducts(List<ProductEntity> products) {
		this.products = products;
	}

	

}
