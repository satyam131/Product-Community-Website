package com.exittest.backend.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exittest.backend.dao.ProductDao;
import com.exittest.backend.model.Product;

@Service
public class ProductService {

	@Autowired
	private ProductDao productDao;

	public List<Product> getProduct() {
		return this.productDao.findAll();
	}

	public Product addProduct(Product product) {
		Product productId = this.productDao.findByProductId(product.getProductId());
		System.out.println(productId);
		if (productId != null) {
			return null;
		}
		return this.productDao.save(product);
	}

	public List<Product> getProductByName(String productName) {
		List<Product> product = this.productDao.findByProductName(productName);
		return product;
	}

	public Product getProductById(int id) {

		Product product = null;
		try {
			product = productDao.findByProductId(id);
		} catch (NoSuchElementException e) {
			System.out.println("No product with this id");
		}
		return product;
	}

	public Long getNumberofProducts() {
		return this.productDao.count();
	}

}
