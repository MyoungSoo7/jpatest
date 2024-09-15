package me.lms.jpatest.inheritance.identify;

import jakarta.persistence.*;

// 특정상황에 조인 없이 하위 테이블만으로 검색 가능한 것이 식별
@Entity
//@IdClass(ParentId.class) //  데이터베이스에 맞춘 방법
public class Parent {

    // 복합키 데이터베이스에 맞춘 방법
    /*@Id @Column(name = "PARENT_ID1")
    private String id1;
    // 복합키 데이터베이스에 맞춘 방법
    @Id @Column(name = "PARENT_ID2")
    private String id2;*/

    @EmbeddedId  // 객체지향적인 방법 - 식별자 클래스에 기본키를 직접 매핑
    private ParentId id;

    private String name;

}
