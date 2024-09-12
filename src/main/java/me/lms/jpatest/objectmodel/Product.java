package me.lms.jpatest.objectmodel;

import jakarta.persistence.*;

@Entity
public class Product {

    @Id
    @Column(name = "PRODUCT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;





}
