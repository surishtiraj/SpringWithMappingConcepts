package com.surishti.FoodApp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String city;
//    @OneToMany(mappedBy = "address")
//    List<Employee>employees;
}
