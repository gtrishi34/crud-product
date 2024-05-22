package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	
@Autowired
private ProductRepository productRepository;
	
	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public List<Product> saveAllProducts(List<Product> products) {
		
		return productRepository.saveAll(products);
	}

	@Override
	public Product getProductById(int id) {
		
		return productRepository.findById(id).orElse(null);
	}

	@Override
	public List<Product> getAllProducts(){
		
		return productRepository.findAll();
	}

	@Override
	public Product updateProduct(Product product) {
		
		Product existingProduct = productRepository.findById(product.getId()).orElse(null);
		existingProduct.setName(product.getName());
		existingProduct.setEmail(product.getEmail());
		return productRepository.save(existingProduct);
	}

	@Override
	public String deleteProduct(int id) {
		productRepository.deleteById(id);
		return "product removed"+id;
	}


}
