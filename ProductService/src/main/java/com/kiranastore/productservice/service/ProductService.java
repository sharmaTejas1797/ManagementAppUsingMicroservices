package com.kiranastore.productservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kiranastore.productservice.model.Product;
import com.kiranastore.productservice.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getProducts() {
		List<Product> allProd = productRepository.findAll();
		return allProd;
	}
	
	public Product createProduct(Product product) {
		Product product1 = new Product();
		product1.setUser_id(product.getUser_id());
		product1.setProduct_name(product.getProduct_name());
		product1.setProduct_quantity(product.getProduct_quantity());
		product1.setProduct_mrp(product.getProduct_mrp());
		
		productRepository.save(product1);
		
		return product1;
	}
}
