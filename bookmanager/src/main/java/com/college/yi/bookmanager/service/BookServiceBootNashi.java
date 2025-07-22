package com.college.yi.bookmanager.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.college.yi.bookmanager.model.BookBootNash;

public class BookServiceBootNashi {

    public List<BookBootNash> getAllBooks() {
        List<BookBootNash> books = new ArrayList<>();
        books.add(new BookBootNash(1, "Java入門", "山田 太郎", "技術評論社", LocalDate.of(2021, 4, 10), 5));
        books.add(new BookBootNash(2, "Spring実践", "佐藤 花子", "翔泳社", LocalDate.of(2022, 3, 15), 3));
        books.add(new BookBootNash(3, "SQLの絵本", "高橋 次郎", "SBクリエイティブ", LocalDate.of(2020, 6, 1), 10));
        books.add(new BookBootNash(4, "アルゴリズム図鑑", "井上 美咲", "インプレス", LocalDate.of(2019, 11, 20), 2));
        books.add(new BookBootNash(5, "オブジェクト指向設計", "中村 健一", "オライリー", LocalDate.of(2023, 1, 25), 0));
        return books;
    }

}
