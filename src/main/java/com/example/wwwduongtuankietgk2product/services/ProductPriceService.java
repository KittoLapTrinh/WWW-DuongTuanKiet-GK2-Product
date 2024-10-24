package com.example.wwwduongtuankietgk2product.services;

import com.example.wwwduongtuankietgk2product.models.ProductPrice;

import java.util.List;

public interface ProductPriceService  {
    List<ProductPrice> getAllProductPrice();
    boolean insert(ProductPrice productPrice);

}
