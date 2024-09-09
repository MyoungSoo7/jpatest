package me.lms.jpatest.datamodel;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "ORDERS")
@Getter
@Setter
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDER_ID")
    private Long id;

    @Column(name = "USER_ID")
    private String userId;

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime orderDate;

    @Enumerated(EnumType.STRING)
    private String status;


}
