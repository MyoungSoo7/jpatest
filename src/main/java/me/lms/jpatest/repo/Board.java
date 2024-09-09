package me.lms.jpatest.repo;


import jakarta.persistence.*;

@Entity
@TableGenerator(name = "BOARD_SEQ_GENERATOR"
        , table = "MY_SEQUENCES"
        , pkColumnValue = "BOARD_SEQ"
        , allocationSize = 1)
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE
            , generator = "BOARD_SEQ_GENERATOR")
    private Long id;



}
