package me.lms.jpatest.inheritance.embedded;

import jakarta.persistence.*;

@Entity
public class Child {

    @EmbeddedId
    private ChildId id;
    @MapsId("parentId") // ParentId의 parentId 매핑
    @ManyToOne
    @JoinColumn(name = "PARENT_ID")
    private Parent parent;
    private String name;

}
