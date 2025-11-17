package com.hust.kstn.test;

import com.hust.kstn.models.Book;
import com.hust.kstn.models.BookAuthor;

public class BookTest {
    public static void main(String[] args) {
        BookAuthor author1 = new BookAuthor("Vu Hoang Tuan", 2006, "Tac gia sach dstt");
        BookAuthor author2 = new BookAuthor("Vu Huan Toang", 2006, "Tac gia sach gt1");
        Book sach = new Book(1, "Vat li dai cuong", "sach tham khao", 100000.0f, 1000);
        sach.addAuthor(author1);
        sach.addAuthor(author2);
        System.out.println(sach.toString());
    }
}
