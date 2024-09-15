package me.lms.jpatest.advancemodel;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@DiscriminatorValue("A")  // 구분 컬럼에 입력할 값을 지정한다.
@PrimaryKeyJoinColumn(name = "ALBUM_ID") // ID재정의
public class Album extends Item {
    private String artist;

}
