package com.pivottech;

import java.util.ArrayList;

// public class Quote {
//     public String author;
//     public String likes;
//     public String text;

// public Quote(String author) {
//         this.author = author;
//     }
public class Result {

    public List<Quote> quotes = new ArrayList<Quote>();

    // return the quotes

    public List<Quote> getQuotes() {
    return quotes;
    }


    // the quotes
    public void setQuote(List<Quote> quotes) {
        this.quotes = quotes;
    }   
}