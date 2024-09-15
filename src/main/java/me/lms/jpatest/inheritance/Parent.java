package me.lms.jpatest.inheritance;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

// 비식별관계로 대체키를 쓰면, 복합기본키를 안써도된다.  특정상황에 조인 없이 하위 테이블만으로 검색 가능한 것이 식별이니 적절한 상황에 사용
@Entity
public class Parent {

    @Id
    @GeneratedValue @Column(name = "PARENT_ID")
    private Long id;
    private String name;

}
