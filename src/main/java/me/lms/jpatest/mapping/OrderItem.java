package me.lms.jpatest.mapping;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import me.lms.jpatest.mapping.item.Item;

@Entity
@Getter
@Setter
public class OrderItem {

    @Id @GeneratedValue
    @Column(name = "order_item_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    private int orderPrice;
    private int count;


}
