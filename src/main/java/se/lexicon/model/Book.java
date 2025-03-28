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
        if(title == null || title.trim().isEmpty()) throw new IllegalArgumentException("Title can't be null or empty");
        this.title = title;
        if(author == null || author.trim().isEmpty()) throw new IllegalArgumentException("Author can't be null or empty");
        this.author = author;
        id = UUID.randomUUID().toString();
        setBorrower(null);
    }

    public Book(String title, String author, Person borrower){
        this(title, author);
        setBorrower(borrower);
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

    public Person getBorrower() {
        return borrower;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setBorrower(Person borrower) {
        if (this.borrower == null){
            this.borrower = borrower;
        }
        if(borrower == null){
            this.available = true;
        } else{
            this.available = false;
        }
    }

    //other methods
    public String getBookInformation(){
        StringBuilder sb = new StringBuilder();
        sb.append("Title: ").append(title).append("\nAuthor: ")
                .append(author).append("\nId: ").append(id)
                .append("\nAvailable: ").append(available).append("\n");

        return sb.toString();
    }


}