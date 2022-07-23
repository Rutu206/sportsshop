package com.sports.sportsshop.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sports.sportsshop.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {
	
	List<Product> findByProductName(String productName);
	
	List<Product> findBySize(String size);
	
	List<Product> findByMrp(Double mrp);
	
	List<Product> findByColor(String color);
	
	Product findByProductId(long ProductId);

}
