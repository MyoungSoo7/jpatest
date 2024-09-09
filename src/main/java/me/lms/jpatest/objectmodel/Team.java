package me.lms.jpatest.objectmodel;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
public class Team {

    @Id
    @GeneratedValue
    @Column(name = "TEAM_ID")
    private String id;

    private String name;

    @OneToMany(mappedBy = "team")
    private List<Member> members = new ArrayList<Member>();

    public void addMember(Member member) {
        this.members.add(member);
        if(member.getTeam() != this) {
            member.setTeam(this);
        }
    }


}
