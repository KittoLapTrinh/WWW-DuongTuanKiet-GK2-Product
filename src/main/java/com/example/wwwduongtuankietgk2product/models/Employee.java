package com.example.wwwduongtuankietgk2product.models;

import com.example.wwwduongtuankietgk2product.enums.EmployeeStatus;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private long id;
    @Column(name = "full_name")
    private String fullName;
    private LocalDate dob;
    private String email;
    private String phone;
    private String address;
    @Enumerated(EnumType.STRING)
    private EmployeeStatus status;

    @OneToMany(mappedBy = "employee")
    private List<Order> orders;

}
