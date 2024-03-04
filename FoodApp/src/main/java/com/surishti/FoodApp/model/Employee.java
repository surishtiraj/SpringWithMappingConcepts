package com.surishti.FoodApp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String designation;
    //one to one unidirection
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "add_id",referencedColumnName = "id")
//    private Address address;
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name ="order_id",referencedColumnName = "id")
//    private Orders order;
    //many to one
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "order_id")
//    private Orders order;
    //one to many
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name="emp_id")
//    private List<Orders> orders;
//    @ManyToMany(cascade = CascadeType.ALL)
//    private List<Orders>orders;
    //bidirection
//    @OneToOne(cascade = CascadeType.ALL,orphanRemoval = true)
//    @JoinColumn(name="order_id",referencedColumnName = "id")
//    private Orders order;
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name ="address_id",referencedColumnName = "id")
//    private Address address;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id")
    private List<Orders> orders;
}
