//Represents an item available for sale.
package com.example.startProject.entity;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
public class Product{

@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

    private String name;
    private String description;
    private BigDecimal price;
    private Integer stockQuantity;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}