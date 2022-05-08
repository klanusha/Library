package com.anusha.library.Service;

import com.anusha.library.Entity.Book;
import com.anusha.library.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public Optional<Book> getBook(int id) {

        //return bookRepository.getById(id);
        return bookRepository.findById(id);
    }
}
