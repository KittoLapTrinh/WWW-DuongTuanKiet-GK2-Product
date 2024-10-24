package com.example.wwwduongtuankietgk2product.models;

import jakarta.persistence.*;

@Entity
@Table(name = "product_image")
public class ProductImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id")
    private long id;
    private String path;
    private String alternative;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
