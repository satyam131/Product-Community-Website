package com.exittest.backend.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Entity
@Table(name = "product")

public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	private String productName;
	private String brandName;
	private int code;
	@OneToMany(mappedBy = "product")
	private List<ProductReview> review;

	public Product(int productId, String productName, String brandName, int code, List<ProductReview> review) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.brandName = brandName;
		this.code = code;
		this.review = review;
	}

	public List<ProductReview> getReview() {
		return review;
	}

	public void setReview(List<ProductReview> review) {
		this.review = review;
	}

	public Product() {
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", brandName=" + brandName
				+ ", code=" + code + ", review=" + review + "]";
	}

}
