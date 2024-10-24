package com.example.wwwduongtuankietgk2product.repositories;

import com.example.wwwduongtuankietgk2product.enums.ProductStatus;
import com.example.wwwduongtuankietgk2product.models.Product;
import com.example.wwwduongtuankietgk2product.repositories.instance.ConnectDB;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository extends CRUDRepository<Product>{
    public ProductRepository(){
        EntityManager manager = ConnectDB.getInstance().getEntityManager();
    }

    public List<Product> findProductByStatus(int productStatus){
        List<Product> products = new ArrayList<>();
        try{
            transaction.begin();
            Query query = entityManager.createNamedQuery("Product.findProductByStatus")
                    .setParameter("productStatus", ProductStatus.values()[productStatus]);
            products = query.getResultList();
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
            transaction.rollback();
        }

        return products;
    }

}
