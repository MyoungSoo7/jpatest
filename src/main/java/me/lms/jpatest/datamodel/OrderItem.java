package me.lms.jpatest.datamodel;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "ORDER_ITEM")
@Getter
@Setter
public class OrderItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDER_ITEM_ID")                private Long id;
    @ManyToOne @JoinColumn(name = "PRODUCT_ID")    private Product product;
    @ManyToOne @JoinColumn(name = "ORDER_ID")      private Order order;
    private int orderPrice;
    private int orderCount;
}
