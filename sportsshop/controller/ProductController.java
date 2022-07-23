package com.sports.sportsshop.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sports.sportsshop.model.Product;
import com.sports.sportsshop.service.ProductService;
import com.sports.sportsshop.serviceImpl.MapValidationErrorService;

@RestController
@RequestMapping("/api/product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@Autowired
	private MapValidationErrorService mve;
	
	@PostMapping("")
	public ResponseEntity<?> add(@Valid @RequestBody Product product ,BindingResult result) {
		ResponseEntity<?> errorMap =  mve.mapValidationError(result);
		if(errorMap!=null) return errorMap;
		Product savedProduct=productService.addProduct(product);
		return new ResponseEntity<Product>(savedProduct , HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{productId}")
	public ResponseEntity<?> remove(@PathVariable("productId") Long productId) {
		productService.removeProduct(productId);
		return new ResponseEntity<String>("Product with ID: " + productId + " deleted successfully",HttpStatus.OK);
		
	}
	
	@GetMapping("/allProduct")
	public List<Product> getAllProduct() {
		return productService.getAllProduct();
	}
	
	@GetMapping("/all")
	public List<Product> getProduct(Long productId){
		return productService.getAllProduct();
	}
	
	@PutMapping("/{productId}")
	public ResponseEntity<?> update(@PathVariable("productId") long productId,Product product) {
			Product pr=productService.updateProduct(productId, product);
		return new ResponseEntity<Product>(pr,HttpStatus.OK);
		
	}
	

}