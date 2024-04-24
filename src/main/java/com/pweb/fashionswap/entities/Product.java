package com.pweb.fashionswap.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@Table(name = "Products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productId")
    private Long id;

    private String name;
    private String description;
    private String size;
    private String color;
    private String brand;
    private String condition;
    private Double price;
    private String image;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Product(Long id, String name, String description, String size, String color, String brand, String condition, Double price, String image, Order order, User user) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.size = size;
        this.color = color;
        this.brand = brand;
        this.condition = condition;
        this.price = price;
        this.image = image;
        this.order = order;
        this.user = user;
    }
//    @ManyToMany
//    @JoinTable(
//            name = "product_tag",
//            joinColumns = @JoinColumn(name = "product_id"),
//            inverseJoinColumns = @JoinColumn(name = "tags_id")
//    )
//    private Set<Tag> tags = new HashSet<>();

}