package com.example.wwwduongtuankietgk2product.services.impl;

import com.example.wwwduongtuankietgk2product.models.ProductImage;
import com.example.wwwduongtuankietgk2product.repositories.ProductImageRepository;
import com.example.wwwduongtuankietgk2product.services.ProductImageService;

import java.util.List;

public class ProductImageServiceImpl implements ProductImageService {
   private final ProductImageRepository repository;

   public ProductImageServiceImpl(){
       repository = new ProductImageRepository();
   }
    @Override
    public List<ProductImage> getAllProductImage() {
        return repository.getAll(ProductImage.class);
    }

    @Override
    public boolean insert(ProductImage productImage) {
        return repository.insert(productImage);
    }
}
