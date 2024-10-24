package com.example.wwwduongtuankietgk2product.data;

import com.example.wwwduongtuankietgk2product.models.Product;
import com.example.wwwduongtuankietgk2product.models.ProductPrice;
import com.example.wwwduongtuankietgk2product.repositories.ProductRepository;

import java.time.LocalDate;
import java.util.List;

public class AddData {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop Dell XPS 13","Ultrabook siêu mỏng nhẹ, hiệu năng cao", "Chiếc","Dell Inc", null);

        ProductPrice pp1 = new ProductPrice(product1, LocalDate.of(2024, 10, 4), 20.5, "Gia Tet");
        ProductPrice pp2 = new ProductPrice(product1, LocalDate.of(2023, 3, 27), 22.0, "Gia Trung Thu");
        ProductPrice pp3 = new ProductPrice(product1, LocalDate.of(2024, 10, 6), 23.5, "Gia Cuoi Tuan");
        List<ProductPrice> productPrices = List.of(pp1, pp2, pp3);
        product1.setProductPrices(productPrices);

        ProductRepository repository = new ProductRepository();
        repository.insert(product1);
        for(ProductPrice p: productPrices){
            System.out.println(p);
        }
    }
}
