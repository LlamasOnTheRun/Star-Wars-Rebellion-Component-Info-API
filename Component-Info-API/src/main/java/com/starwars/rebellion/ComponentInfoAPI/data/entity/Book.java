package com.starwars.rebellion.ComponentInfoAPI.data.entity;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    public Book(){}

    public Book(String name) {
        this.name = name;
    }

}
