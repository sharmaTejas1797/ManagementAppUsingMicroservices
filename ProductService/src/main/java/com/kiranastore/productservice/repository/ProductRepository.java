package com.kiranastore.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kiranastore.productservice.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
