package com.pweb.fashionswap.service;

import com.pweb.fashionswap.entities.Product;
import com.pweb.fashionswap.entities.Review;
import com.pweb.fashionswap.entities.User;
import com.pweb.fashionswap.entities.dto.ReviewDTO;
import com.pweb.fashionswap.repository.ProductRepository;
import com.pweb.fashionswap.repository.ReviewRepository;
import com.pweb.fashionswap.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class ReviewService {
    public ReviewRepository reviewRepository;
    public UserRepository userRepository;
    public ProductRepository productRepository;
    public Review addReview(ReviewDTO reviewDto){

        User user = userRepository.findById(reviewDto.getUserId()).orElse(null);
        Product product = productRepository.findById(reviewDto.getProductId()).orElse(null);

        Review review = Review.builder()
                .rating(reviewDto.getRating())
                .reviewText(reviewDto.getReviewText())
                .createdAt(new Date(System.currentTimeMillis()))
                .title(reviewDto.getTitle())
                .pros(reviewDto.getPros())
                .cons(reviewDto.getCons())
                .user(user)
                .product(product)
                .build();
        return reviewRepository.save(review);
    }


    public List<Review> getReviewsByProductId(Long id) {return reviewRepository.findAllByProductId(id);}

}
