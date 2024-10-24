package com.example.wwwduongtuankietgk2product.services.impl;

import com.example.wwwduongtuankietgk2product.models.Product;
import com.example.wwwduongtuankietgk2product.repositories.ProductRepository;
import com.example.wwwduongtuankietgk2product.services.ProductService;

import java.util.List;
import java.util.Optional;

public class ProductServiceImpl implements ProductService {
    private final ProductRepository repository;

    public ProductServiceImpl(){
        repository = new ProductRepository();
    }
    @Override
    public List<Product> getAllProduct() {
        return repository.getAll(Product.class);
    }

    @Override
    public Product getProductDetail(long id) throws Exception {
        Optional<Product> product = repository.get(Product.class, id);
        if(product.isEmpty())
            throw new Exception("Not Found");
        return product.get();
    }

    @Override
    public boolean insert(Product product) {
        return repository.insert(product);
    }

    @Override
    public List<Product> findProductByStatus(int status) {
        return repository.findProductByStatus(status);
    }
}
