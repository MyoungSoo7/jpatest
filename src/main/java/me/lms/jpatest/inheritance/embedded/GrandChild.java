package me.lms.jpatest.inheritance.embedded;

import jakarta.persistence.*;

// 데이터베이스 설계관점에서는 식별관계보다는 비식별관계를 선호
@Entity
public class GrandChild {

    // 조인할때 이러한 식별방법은 SQL이 복잡해지고 기본키 인덱스가 불필요하게 커질수 있다.
    @EmbeddedId private GrandChildId id;
    @MapsId("childId") // ChildId의 childId 매핑
    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "PARENT_ID"),
        @JoinColumn(name = "CHILD_ID")
    })
    private Child child;

    private String name;

}
