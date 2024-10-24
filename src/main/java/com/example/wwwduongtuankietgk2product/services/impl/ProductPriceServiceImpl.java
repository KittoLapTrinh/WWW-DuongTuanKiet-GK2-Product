package com.example.wwwduongtuankietgk2product.services.impl;

import com.example.wwwduongtuankietgk2product.models.ProductPrice;
import com.example.wwwduongtuankietgk2product.repositories.ProductPriceRepository;
import com.example.wwwduongtuankietgk2product.services.ProductPriceService;
import com.example.wwwduongtuankietgk2product.services.ProductService;

import java.util.List;
import java.util.Optional;

public class ProductPriceServiceImpl implements ProductPriceService {

    private final ProductPriceRepository repository;

    public ProductPriceServiceImpl(){
        repository = new ProductPriceRepository();
    }
    @Override
    public List<ProductPrice> getAllProductPrice() {
        return repository.getAll(ProductPrice.class);
    }

    @Override
    public boolean insert(ProductPrice productPrice) {
        return repository.insert(productPrice);
    }
}
