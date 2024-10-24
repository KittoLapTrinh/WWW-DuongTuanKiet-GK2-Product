package com.example.wwwduongtuankietgk2product.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "product_price")
public class ProductPrice {
    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    @Column(name = "price_date_time")
    private LocalDate priceDateTime;
    private double price;
    private String note;

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setPriceDateTime(LocalDate priceDateTime) {
        this.priceDateTime = priceDateTime;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDate getPriceDateTime() {
        return priceDateTime;
    }

    public double getPrice() {
        return price;
    }

    public String getNote() {
        return note;
    }

    public ProductPrice() {
    }

    public ProductPrice(Product product, LocalDate priceDateTime, double price, String note) {
        this.product = product;
        this.priceDateTime = priceDateTime;
        this.price = price;
        this.note = note;
    }

    @Override
    public String toString() {
        return "ProductPrice{" +
                "product=" + product +
                ", priceDateTime=" + priceDateTime +
                ", price=" + price +
                ", note='" + note + '\'' +
                '}';
    }

    public ProductPrice(LocalDate priceDateTime, double price, String note) {
        this.priceDateTime = priceDateTime;
        this.price = price;
        this.note = note;
    }
}
