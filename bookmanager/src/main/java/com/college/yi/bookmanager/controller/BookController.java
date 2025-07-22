package com.college.yi.bookmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.college.yi.bookmanager.service.BookService;

@Controller
public class BookController {
	
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public String showBooks(Model model) {
        model.addAttribute("books", bookService.getBooksList());
        return "index"; // templates/index.html を表示
    }

}
