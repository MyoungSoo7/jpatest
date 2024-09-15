package me.lms.jpatest.datamodel;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Entity @Setter @Getter
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "PRODUCT_ID")  private Long id;
    @Column private String name;
    @Column private int price;
    @Column private int stockQuantity;
    @ManyToMany(mappedBy = "products") private List<Category> categories = new ArrayList<Category>();
}
