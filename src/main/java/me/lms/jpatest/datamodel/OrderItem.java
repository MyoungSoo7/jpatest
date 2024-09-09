package me.lms.jpatest.datamodel;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "ORDER_ITEM")
@Getter
@Setter
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDER_ITEM_ID")
    private Long id;

    @Column(name = "PRODUCT_ID")
    private Long productId;

    @Column(name = "ORDER_ID")
    private Long itemId;

    private int orderPrice;
    private int orderCount;







}
