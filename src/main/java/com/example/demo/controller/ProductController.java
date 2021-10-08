package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.ProductEntity;
import com.example.demo.entity.ProductResponse;
import com.example.demo.service.ProductsService;

@Controller
@CrossOrigin
@RequestMapping(value = "/products")
public class ProductController {

	@Autowired
	private ProductsService productService;

	// c
	@PostMapping(value = "/addproduct", consumes = { "application/json", "application/xml" }, produces = { "application/json", "application/xml" })
	public ResponseEntity storeProduct(@RequestBody ProductEntity productEntity) {
		return new ResponseEntity(productService.addProduct(productEntity), HttpStatus.CREATED);
	}

	// U
	@PutMapping(value = "/updateproduct", consumes = { "application/json", "application/xml" }, produces = { "application/json", "application/xml" })
	public ResponseEntity updateProduct(@RequestBody ProductEntity productEntity) {
        return new ResponseEntity(productService.updateProduct(productEntity),HttpStatus.OK);
	}

	// R
	@GetMapping(value = "/getallproducts", produces = { "application/json", "application/xml" })
	public ResponseEntity getAllProducts() {
		return new ResponseEntity(new ProductResponse(productService.getAllProducts()), HttpStatus.OK);
	}

	// D
	@DeleteMapping(value="/deleteproduct", produces = { "application/json", "application/xml" })
	public ResponseEntity deleteProduct(@RequestParam("productId") int productId) {
        
		return new ResponseEntity(productService.deleteProduct(productId),HttpStatus.OK);
	}
}
