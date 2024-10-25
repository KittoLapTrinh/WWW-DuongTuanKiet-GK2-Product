package com.example.wwwduongtuankietgk2product.repositories;

import com.example.wwwduongtuankietgk2product.models.ProductPrice;
import com.example.wwwduongtuankietgk2product.repositories.instance.ConnectDB;
import jakarta.persistence.EntityManager;

public class ProductPriceRepository extends CRUDRepository<ProductPrice> {
    public ProductPriceRepository(){
        EntityManager manager = ConnectDB.getInstance().getEntityManager();
    }


}
