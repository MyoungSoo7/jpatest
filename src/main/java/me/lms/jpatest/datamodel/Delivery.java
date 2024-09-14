package me.lms.jpatest.datamodel;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "delivery")
public class Delivery {

    @Id @GeneratedValue @Column(name = "DELIVERY_ID")   private Long id;
    @OneToOne(mappedBy = "delivery")                    private Order order;
                                                        private String city;
                                                        private String street;
                                                        private String zipcode;
    @Enumerated(EnumType.STRING)                        private DeliveryStatus status;
}