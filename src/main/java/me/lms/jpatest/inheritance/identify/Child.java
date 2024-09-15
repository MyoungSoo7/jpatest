package me.lms.jpatest.inheritance.identify;

import jakarta.persistence.*;

@Entity
public class Child {

    @Id private String id;

    // 복합키
    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "PARENT_ID1", referencedColumnName = "PARENT_ID1"),
        @JoinColumn(name = "PARENT_ID2", referencedColumnName = "PARENT_ID2")
    })
    private Parent parent;


}
