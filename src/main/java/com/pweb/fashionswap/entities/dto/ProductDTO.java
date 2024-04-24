package com.pweb.fashionswap.entities.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {
    private String name;
    private String description;
    private String size;
    private String color;
    private String brand;
    private String condition;
    private Double price;
    private String image;
    private Long userId;
}
