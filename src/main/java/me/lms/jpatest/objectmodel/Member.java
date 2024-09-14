package me.lms.jpatest.objectmodel;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {
    // 객체지향 쿼리 JPQL 방향 : 단방향, 양방향이 있다. 양방향은 연관관계의 주인을 정해야 한다.
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "MEMBER_ID") private String id;
                                                                                        private String username;
    @ManyToMany @JoinTable(name = "MEMBER_PRODUCT", joinColumns = @JoinColumn(name = "MEMBER_ID"),
            inverseJoinColumns = @JoinColumn(name = "PRODUCT_ID"))                      private List<Product> products = new ArrayList<Product>();

    // 데이터 중심 테이블은 외래키로 연관관계를 맺는다.
    // 다대일관계 optional = false : 다쪽이 필수로 연관관계가 있어야 한다. fetch = FetchType.LAZY : 지연로딩 , cascade = CascadeType.ALL : 영속성 전이, targetEntity = Team.class : 연관관계의 주인    @ManyToOne
    // 객체는 참조(주소)로 연관관계를 맺는다. 왜래키를 매핑할 때 사용
    @ManyToOne @JoinColumn(name = "TEAM_ID")                                            private Team team;
    @OneToOne(mappedBy = "member") @JoinColumn(name = "LOCKER_ID")                      private Locker locker;

    public void setTeam(Team team) {
        this.team = team;
        if(!team.getMembers().contains(this)) {
            team.getMembers().add(this);
        }
    }

    // 연관관계 매핑 : 다중성(다대일, 일대다, 일대일, 다대다) - 단방향,양방향 - 연관관계의 주인(외래키를 가진 테이블, 많은 쪽)


}
