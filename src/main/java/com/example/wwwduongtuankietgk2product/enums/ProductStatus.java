package com.example.wwwduongtuankietgk2product.enums;

import java.util.List;

public enum ProductStatus{
    TERMINATED(-1),
    IN_ACTIVE(0),
    ACTIVE(1);
    private final int value;

    ProductStatus(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
