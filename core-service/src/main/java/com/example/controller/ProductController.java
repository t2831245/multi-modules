package com.example.controller;

import com.example.entity.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.service.ProductService;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

//    private final ProductService productService;
//
//    public ProductController(ProductService productService) {
//        this.productService = productService;
//    }
//
//    @GetMapping
//    public ResponseEntity<List<Product>> getProducts() {
//        List<Product> products = productService.getProducts();
//        return ResponseEntity.ok(products);
//    }

    @GetMapping
    public Product test(){
        return Product.builder()
                .id("123")
                .price(123)
                .name("123")
                .build();
    }
}
