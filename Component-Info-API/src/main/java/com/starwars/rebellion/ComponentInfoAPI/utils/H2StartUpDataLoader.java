package com.starwars.rebellion.ComponentInfoAPI.utils;

import com.starwars.rebellion.ComponentInfoAPI.dao.Book;
import com.starwars.rebellion.ComponentInfoAPI.repositorys.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class H2StartUpDataLoader implements ApplicationRunner {

    private BookRepository bookRepository;

    @Autowired
    public H2StartUpDataLoader(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void run(ApplicationArguments args) {
        bookRepository.save(new Book("caprisun"));
    }
}
