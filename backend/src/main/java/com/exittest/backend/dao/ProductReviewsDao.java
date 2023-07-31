package com.exittest.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exittest.backend.model.ProductReview;

@Repository
public interface ProductReviewsDao extends JpaRepository<ProductReview, Integer> {

}
