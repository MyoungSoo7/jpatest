package me.lms.jpatest.mapping.item;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@DiscriminatorValue("A")
public class Album extends Item {
    private String artist;
    private String etc;
}
