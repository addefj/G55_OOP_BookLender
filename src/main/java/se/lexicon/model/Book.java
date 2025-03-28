package se.lexicon.model;


import java.util.UUID;

/**
 * This class represents a Book model with properties and methods
 * to manage book-related information and operations.
 */
public class Book {
    // todo: needs completion

    //fields
    private String id;
    private String title;
    private String author;
    private boolean available;
    private Person borrower;

    //constructor
    public Book(String title, String author){
        if(title == null || title.isEmpty()) throw new IllegalArgumentException("can't be null or empty");
        this.title = title;
        if(author == null || author.isEmpty()) throw new IllegalArgumentException("can't be null or empty");
        this.author = author;
        id = UUID.randomUUID().toString();
        //available
    }

    public Book(String title, String author, Person borrower){
        this(title, author);
        this.borrower = borrower;
        //available
    }

    //setters and getters
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setBorrower(Person borrower) {
        if (this.borrower != null){
            this.borrower = borrower;
            available = borrower == null;
        }
    }

    //other methods
    public String getBookInformation(){
        StringBuilder sb = new StringBuilder();
        sb.append("Id: ").append(id).append(", Title: ")
                .append(title).append(", Author: ").append(author)
                .append(", Available: ").append(available);

        return sb.toString();
    }


}