package me.lms.jpatest.advancemodel;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@DiscriminatorValue("M")  // 구분 컬럼에 입력할 값을 지정한다.
@PrimaryKeyJoinColumn(name = "MOVIE_ID") // ID재정의
public class Movie extends Item {
    private String director;
    private String actor;

}
