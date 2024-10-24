package com.example.wwwduongtuankietgk2product.models;

import com.example.wwwduongtuankietgk2product.enums.ProductStatus;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "product")
@NamedQueries({
        @NamedQuery(name = "Product.findProductByStatus",
                query = "select p from Product p where p.productStatus =: productStatus"),
        @NamedQuery(name = "Product.getProductIdAndNameInProductPrice",
                query = "select p.name, p.id from Product p where p.id IN (select DISTINCT pp.product.id from ProductPrice pp)"
        )

})
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private long id;
    private String name;
    private String description;
    private String unit;
    @Column(name = "manufacturer_name")
    private String manufacturerName;
    @Enumerated(EnumType.STRING)
    private ProductStatus productStatus;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<ProductImage> productImages;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<ProductPrice> productPrices;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<OrderDetail> orderDetails;

    public Product() {
    }

    public Product(String name, String description, String unit, String manufacturerName, ProductStatus productStatus) {
        this.name = name;
        this.description = description;
        this.unit = unit;
        this.manufacturerName = manufacturerName;
        this.productStatus = productStatus;
    }

    public Product(String name, String description, String unit, String manufacturerName, ProductStatus productStatus, List<ProductPrice> productPrices) {
        this.name = name;
        this.description = description;
        this.unit = unit;
        this.manufacturerName = manufacturerName;
        this.productStatus = productStatus;
        this.productPrices = productPrices;
    }

    public Product(String name, String description, String unit, String manufacturerName, ProductStatus productStatus, List<ProductImage> productImages, List<ProductPrice> productPrices, List<OrderDetail> orderDetails) {
        this.name = name;
        this.description = description;
        this.unit = unit;
        this.manufacturerName = manufacturerName;
        this.productStatus = productStatus;
        this.productImages = productImages;
        this.productPrices = productPrices;
        this.orderDetails = orderDetails;
    }

    public Product(long id, String name, String description, String unit, String manufacturerName, ProductStatus status, List<ProductImage> productImages, List<ProductPrice> productPrices, List<OrderDetail> orderDetails) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.unit = unit;
        this.manufacturerName = manufacturerName;
        this.productStatus = productStatus;
        this.productImages = productImages;
        this.productPrices = productPrices;
        this.orderDetails = orderDetails;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public void setProductStatus(ProductStatus productStatus) {
        this.productStatus = productStatus;
    }

    public void setProductImages(List<ProductImage> productImages) {
        this.productImages = productImages;
    }

    public void setProductPrices(List<ProductPrice> productPrices) {
        this.productPrices = productPrices;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getUnit() {
        return unit;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public ProductStatus getProductStatus() {
        return productStatus;
    }

    public List<ProductImage> getProductImages() {
        return productImages;
    }

    public List<ProductPrice> getProductPrices() {
        return productPrices;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", unit='" + unit + '\'' +
                ", manufacturerName='" + manufacturerName + '\'' +
                '}';
    }
}
