package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ProductEntity;
import com.example.demo.repository.ProductsRepository;

@Service
public class ProductsService {

	@Autowired
	private ProductsRepository repository;

	public ProductEntity addProduct(ProductEntity product) {
		System.out.println(product);
		return repository.save(product);
	}

	public List<ProductEntity> getAllProducts() {
		List<ProductEntity> list = new ArrayList<ProductEntity>();
		for (ProductEntity product : repository.findAll()) {
			list.add(product);
		}
		return list;
	}

	public boolean deleteProduct(int productId) {
		repository.deleteById(productId);
		return true;
	}

	public ProductEntity updateProduct(ProductEntity product) {
		return repository.save(product);
	}
}
