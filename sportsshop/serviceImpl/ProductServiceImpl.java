package com.sports.sportsshop.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sports.sportsshop.exceptions.ProductIdException;
import com.sports.sportsshop.model.Product;
import com.sports.sportsshop.repo.ProductRepo;
import com.sports.sportsshop.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepo productRepo;
	
	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		productRepo.save(product);
		return product;
	}

	@Override
	public Product removeProduct(long productId) {
		Product product = productRepo.findByProductId(productId);
		if(product==null) {
			throw new ProductIdException("Product Id " + productId + " does not exist");
		}
		productRepo.delete(product);
		return product;
	}

	@Override
	public Product updateProduct(long productId, Product product) {
		Product product1 = productRepo.findById(productId).get();
		productRepo.save(product1);
		return product1;
	}

	@Override
	public Product getProduct(long productId) {
		Product prodId = productRepo.findByProductId(productId);
		if(prodId==null) {
			throw new ProductIdException("Customer Id"+productId+"does not exist");
		}
		return prodId;
	}

	@Override
	public List<Product> getAllProduct() {
		return productRepo.findAll();
	}

	@Override
	public List<Product> getProductByName(String productName) {
        
		return productRepo.findByProductName(productName);
	}

	@Override
	public List<Product> getProductsBySize(String size) {
		
		return productRepo.findBySize(size);
	}

	@Override
	public List<Product> getProductByPrice(Double mrp) {
		return productRepo.findByMrp(mrp);
	}

	@Override
	public List<Product> getProductByColor(String color) {
		// TODO Auto-generated method stub
		return productRepo.findByColor(color);
	}

}