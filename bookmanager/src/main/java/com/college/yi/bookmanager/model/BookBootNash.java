package com.college.yi.bookmanager.model;

import java.time.LocalDate;

public class BookBootNash {

	private int id;
    private String title;
    private String author;
    private String publisher;
    private LocalDate publicationDate;
    private int availability;

    public BookBootNash(int id, String title, String author, String publisher, LocalDate publicationDate, int availability) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publicationDate = publicationDate;
        this.availability = availability;
    }

    // Getter（必要なものだけ）
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getPublisher() { return publisher; }
    public LocalDate getPublicationDate() { return publicationDate; }
    public int getAvailability() { return availability; }

    // toString（デバッグや表示用）
    @Override
    public String toString() {
        return String.format("【%d】%s（%s） - %s / %s 在庫: %d冊",
            id, title, author, publisher, publicationDate, availability);
    }

}
