package me.lms.jpatest.inheritance;


import jakarta.persistence.*;

@Entity
public class GrandChild {

    @Id
    @GeneratedValue
    @Column(name = "GRANDCHILD_ID")
    private Long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "CHILD_ID")
    private Child child;

}
