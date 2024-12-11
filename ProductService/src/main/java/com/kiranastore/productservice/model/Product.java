package com.kiranastore.productservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "productTable")
public class Product {

	@Column
	private int user_id;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	
	@Column
	private String product_name;
	
	@Column
	private int product_quantity;
	
	@Column
	private int product_mrp;
	
	public Product() {
		
	}

	public Product(int user_id, int id, String product_name, int product_quantity, int product_mrp) {
		super();
		this.user_id = user_id;
		this.id = id;
		this.product_name = product_name;
		this.product_quantity = product_quantity;
		this.product_mrp = product_mrp;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public int getProduct_quantity() {
		return product_quantity;
	}

	public void setProduct_quantity(int product_quantity) {
		this.product_quantity = product_quantity;
	}

	public int getProduct_mrp() {
		return product_mrp;
	}

	public void setProduct_mrp(int product_mrp) {
		this.product_mrp = product_mrp;
	}
	
	
}
