package ru.luckoff.mirea.practice_01;

public class Book {
    private String author;
    private int cost;
    private String bookName;

    public Book(String author, int cost, String bookName) {
        this.author = author;
        this.cost = cost;
        this.bookName = bookName;
    }

    public Book(String author, int cost) {
        this.author = author;
        this.cost = cost;
        this.bookName = "null";
    }

    public Book(String author) {
        this.author = author;
        this.cost = 0;
        this.bookName = "null";
    }

    public Book(){
        this.author = "null";
        this.cost = 0;
        this.bookName = "null";
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return author + " '" + bookName + "' - Price: " + cost;
    }
}
