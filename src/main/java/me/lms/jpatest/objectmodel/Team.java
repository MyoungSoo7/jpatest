package me.lms.jpatest.objectmodel;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Team {

    @Id
    @Column(name = "TEAM_ID")
    private String id;

    private String name;


}
