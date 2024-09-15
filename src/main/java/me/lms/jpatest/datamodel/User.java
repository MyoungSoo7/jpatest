package me.lms.jpatest.datamodel;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import me.lms.jpatest.BaseEntity;

import java.util.ArrayList;
import java.util.List;

// 객체는 참조(주소)로 연관관계를 맺는다. 테이블은 외래키로 연관관계를 맺는다.
@Entity @Getter @Setter
@AttributeOverrides({
  @AttributeOverride(name = "id", column = @Column(name = "USER_ID")),
  @AttributeOverride(name = "name", column = @Column(name = "USER_NAME"))
})
public class User extends BaseEntity {
    @Column private String city;
    @Column private String street;
    @Column private String zipcode;
    @OneToMany(mappedBy = "user") private List<Order> orders = new ArrayList<Order>();
}
