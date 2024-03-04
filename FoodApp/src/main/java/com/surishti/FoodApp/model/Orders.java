package com.surishti.FoodApp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @Temporal(TemporalType.DATE)
    @Column(name = "date")
    private Date datee=new Date(System.currentTimeMillis());
    //
//    @OneToOne(mappedBy = "order")
//     Employee employee;

}
