package me.lms.jpatest.advancemodel;


import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)  // 상속매핑은 부모클래스에 @inhteritance를 사용한다. 조인전략
@DiscriminatorColumn(name = "DTYPE") // 부모클래스에 구분 컬럼을 지정한다. 이 컬럼으로 저장된 자식 테이블을 구분할 수 있다.
public abstract class Item {

    @Id
    @Column(name="ITEM_ID")
    @GeneratedValue
    private Long id;

    private String name;
    private int price;


}
