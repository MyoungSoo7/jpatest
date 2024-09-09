package me.lms.jpatest.repo;

public class Member {
    // jpa @Transient : 매핑하지 않고 , 따라서 데이터베이스에 저장하지 않고 조회하지도 않는다. 객체에 임시로 어떤 값을 보관하고 싶을 때 사용한다.
    // @Access : 엔티티 데이터에 접근하는 방식을 지정한다.
    // @Access(AccessType.FIELD) : 필드에 직접 접근한다.

    private String id;
    private String username;
    private Integer age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
