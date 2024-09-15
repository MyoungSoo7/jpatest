package me.lms.jpatest.inheritance.embedded;

import jakarta.persistence.Column;

import java.io.Serializable;

public class GrandChildId implements Serializable {
    private ChildId childId; // GrandChildId의 childId 매핑
    @Column(name = "GRANDCHILD_ID") private String id;

    // equals, hashCode
    public boolean equals(Object obj) {
        if (obj instanceof GrandChildId) {
            GrandChildId id = (GrandChildId) obj;
            return id.childId.equals(childId) && id.id.equals(id);
        }
        return false;
    }

    public int hashCode() {
        return childId.hashCode() + id.hashCode();
    }
}
