package com.college.yi.bookmanager.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.college.yi.bookmanager.model.Book;

@Service
public class BookService {
	
	public List<Book> getBooksList() {
	
	List<Book> books = new ArrayList<>();
	
	Book book1 = new Book(1, "Java入門", "山田 太郎", "A出版社", LocalDate.of(2025, 7, 15), 2200);
	Book book2 = new Book(2, "SpringBoot入門", "佐藤 花子", "B出版社", LocalDate.of(2025, 7, 15), 2200);
	Book book3 = new Book(3, "SQL入門", "中村 健一", "C出版社", LocalDate.of(2025, 7, 15), 2200);
	Book book4 = new Book(4, "オブジェクト指向設計", "高橋 直人", "D出版社", LocalDate.of(2025, 7, 15), 2200);
	Book book5 = new Book(5, "アルゴリズム図鑑", "石井 美咲", "E出版社", LocalDate.of(2025, 7, 15), 2200);

	books.add(book1);
	books.add(book2);
	books.add(book3);
	books.add(book4);
	books.add(book5);
	
	return books;
	}
}
