package com.pweb.fashionswap.controller;

import com.pweb.fashionswap.entities.Review;
import com.pweb.fashionswap.entities.dto.ReviewDTO;
import com.pweb.fashionswap.service.ReviewService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@SecurityRequirement(name = "bearerAuth")
public class ReviewController {
    private ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("/reviews/{id}")
    public List<Review> getReviewByUserId(@PathVariable Long id) {
        return reviewService.getReviewsByProductId(id);
    }

    @PostMapping("/reviews")
    public Review addReview(@RequestBody ReviewDTO reviewDto){return reviewService.addReview(reviewDto);}
}
