package com.anusha.library.controller;

import com.anusha.library.Entity.Book;
import com.anusha.library.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.Optional;

@RestController("/books")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/id")
    public Optional<Book> getbook(@PathParam("id") int id) {
        return bookService.getBook(id);
    }

    @GetMapping("/abc")
    public void addbook() {
        System.out.println("get books");
    }

}
