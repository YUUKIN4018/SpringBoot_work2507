package com.college.yi.bookmanager.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.college.yi.bookmanager.model.Book;
import com.college.yi.bookmanager.service.BookService;

@RestController
@RequestMapping("/api/books")
public class BookControllerAPI {
	
    private final BookService bookService;

    public BookControllerAPI(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getBooksAsJson() {
        return bookService.getBooksList();
    }
}
