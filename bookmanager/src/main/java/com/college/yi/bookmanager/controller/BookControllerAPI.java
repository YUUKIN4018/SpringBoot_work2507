package com.college.yi.bookmanager.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
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

	//新規登録
	@PostMapping
	public ResponseEntity<Book> createBook(@RequestBody Book newBook) {
		Book created = bookService.createBook(newBook);
		return new ResponseEntity<>(created, HttpStatus.CREATED); // 201 Created
	}
	
	//更新
	@PutMapping("/{id}")
	public Book updateBook(@PathVariable int id, @RequestBody Book updatedBook) {
	    return bookService.updateBook(id, updatedBook);
	}
	
    //削除
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT) // 204を返却
    public void deleteBook(@PathVariable int id) {
        bookService.deleteBook(id);
    }

}