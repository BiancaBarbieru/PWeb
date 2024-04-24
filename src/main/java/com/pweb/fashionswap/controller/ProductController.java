package com.pweb.fashionswap.controller;

import com.pweb.fashionswap.entities.Product;
import com.pweb.fashionswap.entities.dto.ProductDTO;
import com.pweb.fashionswap.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody ProductDTO product) {
        return productService.addProduct(product);
    }

    @GetMapping("/products/{id}")
    public List<Product> getProductsByUser(@PathVariable Long id) {
        return productService.getProductsByUser(id);
    }

    @GetMapping("/products")
    public  List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @DeleteMapping("/products/{id}")
    public void deleteProductById(@PathVariable Long id) {
        productService.deleteProductById(id);
    }
}
