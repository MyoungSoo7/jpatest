package me.lms.jpatest.mapping.item;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import me.lms.jpatest.mapping.Category;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="DTYPE")
public abstract class Item {

  @Id @GeneratedValue
  @Column(name = "item_id")
  private Long id;
  private String name;
  private int price;
  private int stockQuantity;

  @ManyToMany(mappedBy = "items")
  private List<Category> categories = new ArrayList<Category>();


}