package me.lms.jpatest.inheritance.identify;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;


// 식별 관계는 부모테이블의 기본 키를 자식테이블로 전파하면서 자식테이블의 기본키 컬럼이 점점 늘어난다.
@Embeddable
public class ParentId implements Serializable {

    @Column(name = "PARENT_ID1")
    private String id1;
    @Column(name = "PARENT_ID2")
    private String id2;

    /*public ParentId() {
    }

    public ParentId(String id1, String id2) {
        this.id1 = id1;
        this.id2 = id2;
    }*/

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ParentId) {
            ParentId id = (ParentId) obj;
            return id.id1.equals(id1) && id.id2.equals(id2);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return id1.hashCode() + id2.hashCode();
    }

}
