package com.starwars.rebellion.ComponentInfoAPI.repository;

import com.starwars.rebellion.ComponentInfoAPI.data.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
    Book findByName(String name);
    Book save(Book book);
}