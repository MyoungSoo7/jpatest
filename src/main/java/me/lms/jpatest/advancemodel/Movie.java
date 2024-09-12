package me.lms.jpatest.advancemodel;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("M")  // 구분 컬럼에 입력할 값을 지정한다.
public class Movie {
    private String director;
    private String actor;

}
