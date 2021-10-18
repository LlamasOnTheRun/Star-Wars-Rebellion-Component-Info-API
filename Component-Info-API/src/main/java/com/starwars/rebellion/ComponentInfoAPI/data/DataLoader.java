package com.starwars.rebellion.ComponentInfoAPI.data;

import com.starwars.rebellion.ComponentInfoAPI.data.entity.Book;
import com.starwars.rebellion.ComponentInfoAPI.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    private BookRepository bookRepository;

    @Autowired
    public DataLoader(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void run(ApplicationArguments args) {
        bookRepository.save(new Book("caprisun"));
    }
}
