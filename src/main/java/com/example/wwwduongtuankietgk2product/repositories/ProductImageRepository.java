package com.example.wwwduongtuankietgk2product.repositories;

import com.example.wwwduongtuankietgk2product.models.ProductImage;
import com.example.wwwduongtuankietgk2product.repositories.instance.ConnectDB;
import jakarta.persistence.EntityManager;

public class ProductImageRepository extends CRUDRepository<ProductImage> {
    public ProductImageRepository(){
        EntityManager manager = ConnectDB.getInstance().getEntityManager();
    }
}
