package com.college.yi.bookmanager.model;

import java.time.LocalDate;

public class BookEntity {

	private int id;
	private String title;
	private String author;
	private String publisher;
	private LocalDate publishedDate;
	private int stock;

	//登録用コンストラクタ
	public BookEntity(String title, String author, String publisher, LocalDate publishedDate, int stock) {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	//更新用コンストラクタ
	public BookEntity(int id, String title, String author, String publisher, LocalDate publishedDate, int stock) {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	//ゲッター
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}

	public LocalDate getPublishedDate() {
		return publishedDate;
	}

	public int getStock() {
		return stock;
	}

	//セッター
	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setPublishedDate(LocalDate publishedDate) {
		this.publishedDate = publishedDate;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
}
