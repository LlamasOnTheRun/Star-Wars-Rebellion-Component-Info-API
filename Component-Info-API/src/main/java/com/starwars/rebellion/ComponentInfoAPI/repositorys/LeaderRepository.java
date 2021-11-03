package com.starwars.rebellion.ComponentInfoAPI.repositorys;

import com.starwars.rebellion.ComponentInfoAPI.dao.Book;
import org.springframework.data.repository.CrudRepository;

public interface LeaderRepository extends CrudRepository<Book, Long> {
    Book save(Book book);
}