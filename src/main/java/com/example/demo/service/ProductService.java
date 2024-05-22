package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Product;

public interface ProductService {
	
	
	Product saveProduct(Product product);
	List<Product> saveAllProducts(List<Product> products);
	
	Product getProductById(int id);
	List<Product> getAllProducts();
	
	Product updateProduct(Product product);
	
	String deleteProduct(int id);
	
	
	
	
	
	
	
	
	

	
}
