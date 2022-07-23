package com.sports.sportsshop.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(schema = "APP")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)                                                              
	private long productId;
	
	@NotBlank( message="Name is required")
	@Column
	private String productName;
	
	@Column
	private String category;
	
	@Column
	private String description;
	
	@Column
	private String brand;
	
	@Column
	private String color;
	
	@Column
	private String size;
	
	@Column
	private double mrp;
	
	@Column
	private int discount;
	
	@Column
	private double priceAfterDiscount;
	
	@Column
	private boolean inStock;
	
	@Column
	private LocalDate estimatedDelivery;
	
	@ManyToOne
	//@JoinColumn(name="productName",referencedColumnName="productName")
	private Cart cart;
	
	
	public Product() {
		
	}
	
	
	public Product(String string, String string2, String string3, String string4, String string5, String string6,double a,int b,double c,boolean d,String f) {
		// TODO Auto-generated constructor stub
	}









	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public String getSize() {
		return size;
	}



	public void setSize(String size) {
		this.size = size;
	}



	public double getMrp() {
		return mrp;
	}



	public void setMrp(double mrp) {
		this.mrp = mrp;
	}



	public int getDiscount() {
		return discount;
	}



	public void setDiscount(int discount) {
		this.discount = discount;
	}



	public double getPriceAfterDiscount() {
		return priceAfterDiscount;
	}



	public void setPriceAfterDiscount(double priceAfterDiscount) {
		this.priceAfterDiscount = priceAfterDiscount;
	}



	public boolean isInStock() {
		return inStock;
	}



	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}



	public LocalDate getEstimatedDelivery() {
		return estimatedDelivery;
	}



	public void setEstimatedDelivery(LocalDate estimatedDelivery) {
		this.estimatedDelivery = estimatedDelivery;
	}


	public Cart getCart() {
		return cart;
	}


	public void setCart(Cart cart) {
		this.cart = cart;
	}

    
	
	



}    
	
	


