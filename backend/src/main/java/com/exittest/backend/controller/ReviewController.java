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

import com.exittest.backend.model.ProductReview;
import com.exittest.backend.service.ProductReviewService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ReviewController {

	@Autowired
	private ProductReviewService productReviewService;

	@SuppressWarnings("rawtypes")
	@PostMapping("/add-reviews/{id}")
	public ResponseEntity addReview(@RequestBody ProductReview review, @PathVariable("id") int id) {

		productReviewService.addReviews(review, id);

		return ResponseEntity.status(200).build();
	}

	@GetMapping("/admin/all-reviews")
	@CrossOrigin
	public ResponseEntity<List<ProductReview>> getReviews() {

		List<ProductReview> list = this.productReviewService.getReview();
		if (list.size() == 0)
			return ResponseEntity.noContent().build();
		return ResponseEntity.ok(list);
	}

	@SuppressWarnings("rawtypes")
	@GetMapping("/admin/update/{id}/{state}")
	@CrossOrigin
	public ResponseEntity updateReview(@PathVariable("state") String state, @PathVariable("id") int id) {
		productReviewService.updateState(state, id);
		return ResponseEntity.status(200).build();
	}

	@GetMapping("/count-reviews")
	public Long getNumberOfReviews() {
		return this.productReviewService.getNoOfReviews();
	}

}
