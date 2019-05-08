package com.example.springboot.japh2withrest.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Book {

    private @Id @GeneratedValue Long id;
    private String title;
    private String author;

    public Book(){}

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}
