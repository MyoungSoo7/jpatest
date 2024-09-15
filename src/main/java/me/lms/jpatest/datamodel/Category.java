package me.lms.jpatest.datamodel;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Entity @Getter @Setter
public class Category {

    @Id @GeneratedValue @Column(name = "CATEGORY_ID")               private Long id;
                                                                    private String name;
    @ManyToMany @JoinTable(name = "CATEGORY_PRODUCT",
            joinColumns = @JoinColumn(name = "CATEGORY_ID"),
            inverseJoinColumns = @JoinColumn(name = "PRODUCT_ID"))  private List<Product> products = new ArrayList<Product>();

    @ManyToOne @JoinColumn(name = "PARENT_ID")                      private Category parent;
    @OneToMany(mappedBy = "parent")                                 private List<Category> child = new ArrayList<Category>();

    public void addChildCategory(Category child) {
        this.child.add(child);
        child.setParent(this);
    }

    public void addItem(Product item) {
        products.add(item);
    }


}
