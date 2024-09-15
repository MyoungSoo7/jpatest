package me.lms.jpatest.inheritance.embedded;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Parent {
    @Id @Column(name = "PARENT_ID")
    private String id;
    private String name;

}
