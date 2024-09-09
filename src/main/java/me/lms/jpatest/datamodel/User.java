package me.lms.jpatest.datamodel;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Long id;

    @Column
    private String name;
    @Column
    private String city;
    @Column
    private String street;
    @Column
    private String zipcode;
}
