package com.example.springboot.japh2withrest.repositories;

import com.example.springboot.japh2withrest.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
   List<Book> findByTitle(String title);
   List<Book> findByAuthor(String author);
}