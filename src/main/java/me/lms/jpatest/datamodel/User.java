package me.lms.jpatest.datamodel;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


// 객체는 참조(주소)로 연관관계를 맺는다.
// 테이블은 외래키로 연관관계를 맺는다.
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
