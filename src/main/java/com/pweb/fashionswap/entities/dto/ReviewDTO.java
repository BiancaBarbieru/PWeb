package com.pweb.fashionswap.entities.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ReviewDTO {
    private Integer rating;
    private String reviewText;
    private Date createdAt;
    private String title;
    private String pros;
    private String cons;
    private Long userId;
    private Long productId;
}
