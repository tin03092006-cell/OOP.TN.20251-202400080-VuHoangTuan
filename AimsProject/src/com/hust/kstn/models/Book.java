package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {

    private int numOfTokens;
    private List<BookAuthor> authors = new ArrayList<>();
    public Book(int id, String title, String category, float cost) {
        super(id, title, category, cost);
    }

    public Book(int id, String title, String category, float cost, int numOfTokens) {
        super(id, title, category, cost);
        this.numOfTokens = numOfTokens;
    }

    public void addAuthor(BookAuthor author) {
        if (!authors.contains(author)) {
            authors.add(author);
        }
    }

    public void removeAuthor(BookAuthor author) {
        if (authors.contains(author)) {
            authors.remove(author);
        }
    }

    public int getNumOfTokens() {
        return numOfTokens;
    }

    @Override
    public String toString() {
       
        return "Book - " + getTitle() + " - " + getCategory() + " - " + getCost() + "$ - Tokens: " + numOfTokens + " - Authors: " + authors;
    }
}
