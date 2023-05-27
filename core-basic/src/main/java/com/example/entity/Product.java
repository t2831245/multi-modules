package com.example.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Data
@Document(collection = "products")
public class Product {
    private String id;
    private String name;
    private int price;
}