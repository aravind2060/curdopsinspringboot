package com.example.demo.entity;

import java.util.List;

public class ProductResponse {

	private List<ProductEntity> list;

	public ProductResponse(List<ProductEntity> list) {
		super();
		this.list = list;
	}

	public List<ProductEntity> getList() {
		return list;
	}

	public void setList(List<ProductEntity> list) {
		this.list = list;
	}

}
