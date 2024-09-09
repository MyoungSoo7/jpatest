package me.lms.jpatest.objectmodel;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Member {

    @Id
    @Column(name = "MEMBER_ID")
    private String id;

    private String username;

    // 객체는 참조(주소)로 연관관계를 맺는다.
    // 테이블은 외래키로 연관관계를 맺는다.
    @ManyToOne
    @JoinColumn(name = "TEAM_ID")
    private Team team;

    public void setTeam(Team team) {
        this.team = team;
    }


}
