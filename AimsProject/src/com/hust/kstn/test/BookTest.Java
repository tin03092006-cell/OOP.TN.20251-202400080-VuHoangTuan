package com.hust.kstn.test;

import com.hust.kstn.models.BookAuthor;
import com.hust.kstn.models.Book;

public class BookTest {
    public static void main(String[] args) {
        BookAuthor author1 = new BookAuthor("Vu Hoang Tuan", 2006, "Tac gia sach dstt");
        BookAuthor author2 = new BookAuthor("Vu Huan Toang", 2006, "Tac gia sach gt1");
        BookAuthor author3 = new BookAuthor("Vuan Hoang Tu", 2006, "Tac gia sach xstk");
        BookAuthor[] authors = {author1, author2};
        Book sach = new Book("Vat li dai cuong", "sach tham khao", 100000.0, 1000, authors);



        System.out.println(authors);
        System.out.println(sach.toString());
        
    }
}