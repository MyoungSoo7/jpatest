package me.lms.jpatest.inheritance.identify.one;

import jakarta.persistence.*;

@Entity
public class Board {

    @Id @GeneratedValue @Column(name = "BOARD_ID")
    private Long id;
    private String title;
    @OneToOne(mappedBy = "board")
    private BoardDetail boardDetail;
}
