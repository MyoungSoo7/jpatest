package me.lms.jpatest.mapping;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import me.lms.jpatest.BaseEntity;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Member   {

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;
    @Column
    private String name;
    @Column
    private String city;
    @Column
    private String street;
    @Column
    private String zipcode;

    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<Order>();

}
