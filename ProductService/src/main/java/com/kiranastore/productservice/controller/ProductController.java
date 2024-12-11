package com.kiranastore.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kiranastore.productservice.model.Product;
import com.kiranastore.productservice.service.ProductService;

@RestController
@RequestMapping("/product-service")
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@GetMapping("/test")
	public String test(){
	    return "Hello world!";
	}
	
	@GetMapping("/products")
	public List<Product> getProducts() {
		List<Product> prodList = productService.getProducts();
		return prodList;
	}
	
	@GetMapping("/{id}")
	public String getProductById(@PathVariable int id) {
		return "product found";
	}
	
	@PostMapping("/createProduct")
	public Product createProduct(@RequestBody Product product) {
		Product prod = productService.createProduct(product);
		return prod;
	}
}
	