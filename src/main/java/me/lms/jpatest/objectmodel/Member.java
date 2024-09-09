package me.lms.jpatest.objectmodel;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Member {

     //객체지향 쿼리 JPQL : select m from Member m where m.username = 'kim'
    @Id
    @Column(name = "MEMBER_ID")
    private String id;

    private String username;

    // 데이터 중심 테이블은 외래키로 연관관계를 맺는다. 객체는 참조(주소)로 연관관계를 맺는다.
    // 다대일관계 optional = false : 필수로 연관관계가 있어야 한다. fetch = FetchType.LAZY : 지연로딩 , cascade = CascadeType.ALL : 영속성 전이, targetEntity = Team.class : 연관관계의 주인    @ManyToOne
    // 왜래키를 매핑할 때 사용
    @JoinColumn(name = "TEAM_ID")
    private Team team;

    public void setTeam(Team team) {
        this.team = team;
    }


}
