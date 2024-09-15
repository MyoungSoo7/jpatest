package me.lms.jpatest.inheritance.embedded;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class ChildId implements Serializable {
    private String parentId; // ChildId의 parentId 매핑
    @Column(name = "CHILD_ID") private String childId;

    // equals, hashCode
    public boolean equals(Object obj) {
        if (obj instanceof ChildId) {
            ChildId id = (ChildId) obj;
            return id.parentId.equals(parentId) && id.childId.equals(childId);
        }
        return false;
    }

    public int hashCode() {
        return parentId.hashCode() + childId.hashCode();
    }

}
