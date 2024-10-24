package com.example.wwwduongtuankietgk2product.enums;

import com.example.wwwduongtuankietgk2product.models.Employee;

public enum EmployeeStatus {
    TERMINATED(-1),
    IN_ACTIVE(0),
    ACTIVE(1);

    private final int value;

    EmployeeStatus(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
