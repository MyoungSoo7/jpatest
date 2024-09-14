package me.lms.jpatest.datamodel;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ORDERS") @Getter @Setter
public class Order {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDER_ID")                              private Long id;
    @ManyToOne @JoinColumn(name = "USER_ID")                private User user; // 주문유저
    @OneToMany(mappedBy = "order")                          private List<OrderItem> orderItems= new ArrayList<OrderItem>();
    @Temporal(TemporalType.TIMESTAMP)                       private LocalDateTime orderDate;
    @Enumerated(EnumType.STRING)                            private OrderStatus status;

    public void setMember(User user) {
        if(this.user != null) {
            this.user.getOrders().remove(this);
        }
        this.user = user;
        user.getOrders().add(this);
    }


    public void addOrderItem(OrderItem orderItem) {
        orderItems.add(orderItem);
        orderItem.setOrder(this);
    }


}
