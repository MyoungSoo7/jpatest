package me.lms.jpatest.model1;


import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String orderName;

    @Column
    private LocalDateTime orderDate;

    @Column
    private LocalDateTime cancelDate;


}
