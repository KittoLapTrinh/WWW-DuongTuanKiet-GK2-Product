package com.example.wwwduongtuankietgk2product.services;

import com.example.wwwduongtuankietgk2product.models.ProductImage;
import com.example.wwwduongtuankietgk2product.models.ProductPrice;

import java.util.List;

public interface ProductImageService {
    List<ProductImage> getAllProductImage();
    boolean insert(ProductImage productImage);
}
