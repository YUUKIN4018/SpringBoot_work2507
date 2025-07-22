package com.college.yi.bookmanager.controller;

import java.util.List;

import com.college.yi.bookmanager.model.BookBootNash;
import com.college.yi.bookmanager.service.BookServiceBootNashi;

public class BookControllerBootNashi {

    private BookServiceBootNashi bookService = new BookServiceBootNashi();

    public void showBookListAsJSON() {
        List<BookBootNash> books = bookService.getAllBooks();

        System.out.println("[");
        for (int i = 0; i < books.size(); i++) {
        	BookBootNash b = books.get(i);
            System.out.printf(
                "  { \"id\": %d, \"title\": \"%s\", \"author\": \"%s\", \"publisher\": \"%s\", \"publicationDate\": \"%s\", \"availability\": %d }%s\n",
                b.getId(), b.getTitle(), b.getAuthor(), b.getPublisher(), b.getPublicationDate(), b.getAvailability(),
                (i < books.size() - 1) ? "," : ""
            );
        }
        System.out.println("]");
    }

}
