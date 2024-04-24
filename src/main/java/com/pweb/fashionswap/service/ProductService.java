package com.pweb.fashionswap.service;

import com.pweb.fashionswap.entities.Product;
import com.pweb.fashionswap.entities.User;
import com.pweb.fashionswap.entities.dto.ProductDTO;
import com.pweb.fashionswap.repository.ProductRepository;
import com.pweb.fashionswap.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    private final UserRepository userRepository;

    public ProductService(ProductRepository productRepository, UserRepository userRepository) {
        this.productRepository = productRepository;
        this.userRepository = userRepository;
    }


    public Product addProduct(ProductDTO productdto) {
        User user = userRepository.findById(productdto.getUserId()).orElse(null);
        Product product = Product.builder()
                .name(productdto.getName())
                .description(productdto.getDescription())
                .size(productdto.getSize())
                .color(productdto.getColor())
                .brand(productdto.getBrand())
                .condition(productdto.getCondition())
                .price(productdto.getPrice())
                .image(productdto.getImage())
                .user(user)
                .build();
        return productRepository.save(product);
    }

    public List<Product> getProductsByUser(Long id) {
        return productRepository.findAllByUserId(id);
    }

    public List<Product> getAllProducts(){ return productRepository.findAll();}

    public void deleteProductById(Long id) {productRepository.deleteById(id);}
}
