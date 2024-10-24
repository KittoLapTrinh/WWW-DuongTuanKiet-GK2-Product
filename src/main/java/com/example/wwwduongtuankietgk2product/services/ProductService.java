package com.example.wwwduongtuankietgk2product.services;

import com.example.wwwduongtuankietgk2product.models.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProduct();
    Product getProductDetail(long id) throws Exception;
    boolean insert(Product product);
    List<Product> findProductByStatus(int status);

}
