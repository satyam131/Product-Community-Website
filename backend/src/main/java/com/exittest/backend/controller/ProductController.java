package com.exittest.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exittest.backend.model.Product;
import com.exittest.backend.service.ProductService;

//product Controller

@CrossOrigin("*")
@RequestMapping("/api")
@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	@CrossOrigin("http://localhost:4200")
	@GetMapping("/all-products")
	public List<Product> getAllProduct()
	{
		return this.productService.getProduct();
	}
	@CrossOrigin()
	@PostMapping("/add-products")
	public Product addProduct(@RequestBody Product product)
	{
		return this.productService.addProduct(product);
	}
	
	@SuppressWarnings("rawtypes")
	@CrossOrigin("http://localhost:4200")
	@GetMapping("/search/{productName}")
	public ResponseEntity getproductByName(@PathVariable String productName)
	{
		List<Product>  product = this.productService.getProductByName(productName);

		if (product == null) {
			return ResponseEntity.status(401).build();
		}
		return ResponseEntity.status(200).body(product);
	}
	
	@GetMapping("/product/{id}")
	public Product productById(@PathVariable int id)
	{
		return this.productService.getProductById(id);
	}
	
	@GetMapping("/count-products")
	public Long getProductCount() {
		return this.productService.getNumberofProducts();
	}
}
