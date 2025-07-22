package com.college.yi.bookmanager.model;

import java.time.LocalDate;

public class Book {

	//フィールド
	//id
	private int id;
	//タイトル
	private String title;
	//著者
	private String author;
	//出版社
	private String publisher;
	//出版日
	private LocalDate publishedDate;
	//在庫数
	private int stock;
	
    //コンストラクタ
    public Book(int id, String title, String author, String publisher, LocalDate publishedDate, int stock) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publishedDate = publishedDate;
        this.stock = stock;
    }
    
    //ゲッター
    public int getId(){
        return id;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public String getPublisher(){
        return publisher;
    }
    
    public LocalDate getPublishedDate(){
        return publishedDate;
    }
    
    public int getStock(){
        return stock;
    }
    
//    //セッター
//    public void setId(int id){
//        this.id = id;
//    }
//    
//    public void setTitle(String title){
//        this.title = title;
//    }
//    
//    public void setAuthor(String author){
//        this.author = author;
//    }
//    
//    public void setPublisher(String publisher){
//        this.publisher = publisher;
//    }
//    
//    public void setPublishedDate(LocalDate publishedDate){
//        this.publishedDate = publishedDate;
//    }
//    
//    public void setStock(int stock){
//        this.stock = stock;
//    }
}
