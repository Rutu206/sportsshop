package com.sports.sportsshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sports.sportsshop.model.Product;

@Service
public interface ProductService {
	
	public Product addProduct(Product product);
	
	public Product removeProduct(long productId);
	
	public Product updateProduct(long productId, Product product);
	
	public Product getProduct(long productId);
	
	public List<Product> getAllProduct();
	
	public List<Product> getProductByName(String productName);
	
	public List<Product> getProductsBySize(String size);
	
	public List<Product> getProductByPrice(Double mrp);
	
	public List<Product> getProductByColor(String color);
	
}

