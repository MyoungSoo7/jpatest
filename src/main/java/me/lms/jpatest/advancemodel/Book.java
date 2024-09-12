package me.lms.jpatest.advancemodel;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@DiscriminatorValue("B")  // 구분 컬럼에 입력할 값을 지정한다.
@PrimaryKeyJoinColumn(name = "BOOK_ID") // ID재정의
public class Book extends Item {
        
    private String author;
    private String isbn;
    
}
