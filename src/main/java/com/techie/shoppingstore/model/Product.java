package com.techie.shoppingstore.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.List;

@Document(collection = "Product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private String sku;
    private String imageUrl;
    private Category category;
    private List<ProductAttribute> productAttributeList;
    private Integer quantity;
    private String manufacturer;
    private boolean featured;
}