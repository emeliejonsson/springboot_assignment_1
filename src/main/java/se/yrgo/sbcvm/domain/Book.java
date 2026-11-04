package se.yrgo.sbcvm.domain;

public class Book {
    private String title;
    private String author;
    private String genre;

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getGenre() { return genre; }

    public void setAuthor(String author) { this.author = author; }
    public void setGenre(String genre) { this.genre = genre; }
    public void setTitle(String title) { this.title = title; }

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public Book(){}
}
