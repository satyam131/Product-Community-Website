package com.exittest.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exittest.backend.dao.ProductReviewsDao;
import com.exittest.backend.model.Product;
import com.exittest.backend.model.ProductReview;

@Service
public class ProductReviewService {
	@Autowired
	private ProductReviewsDao productReviewsDao;
	@Autowired
	private ProductService productService;
	
	public ProductReview addReviews(ProductReview review, int id) {
		Product p = productService.getProductById(id);
		p.getReview().add(review);
		review.setProduct(p);
		productReviewsDao.save(review);

		return review;
	}

	public List<ProductReview> getReview() {
		List<ProductReview> list = (List<ProductReview>) this.productReviewsDao.findAll();
		return list;

	}
	public void updateState(String state, int id) {
		ProductReview review = productReviewsDao.getOne(id);
		review.setState(state); 
		productReviewsDao.save(review); 
	}
	
	public Long getNoOfReviews()
	{
		return this.productReviewsDao.count();
	}


}
