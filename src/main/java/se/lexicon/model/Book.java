package se.lexicon.model;


import java.util.UUID;

/**
 * This class represents a Book model with properties and methods
 * to manage book-related information and operations.
 */
public class Book {

    //fields
    private String id;
    private String title;
    private String author;
    private boolean available;
    private Person borrower;

    //constructor
    public Book(String title, String author){
        this(title, author, null);
    }

    public Book(String title, String author, Person borrower){
        setTitle(title); //call method to set title
        setAuthor(author); //call method to set author
        this.id = UUID.randomUUID().toString(); //set a random generated Id String
        this.available = true; //set book as available

        if(borrower == null){
            setBorrower(null); //if there's no initial borrower
        } else{
            borrower.loanBook(this); //if there's an initial borrower, use the lone book method to add the book to the person
        }
    }

    //getters and setters
    public String getId() { //no real use, could remove
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

    public boolean isAvailable() { //available status for each book object changes automatically with set borrower
        return available;
    }

    public void setTitle(String title) {
        if(title == null || title.trim().isEmpty())
            throw new IllegalArgumentException("Title can't be null or empty");
        this.title = title;
    }

    public void setAuthor(String author) {
        if(author == null || author.trim().isEmpty())
            throw new IllegalArgumentException("Author can't be null or empty");
        this.author = author;
    }

    public void setBorrower(Person borrower) {
        if (this.borrower == null){ //if there's no borrower yet, set borrower to what's sent from caller
            this.borrower = borrower;
        }
        if(borrower != null){
            this.available = false;
        } else {
            this.available = true;
        }
    }

    //other methods
    public String getBookInformation(){
        StringBuilder sb = new StringBuilder();
        sb.append("Title: ").append(title).append(", Author: ")
                .append(author).append(", Available: ").append(available)
                .append(", Id: ").append(id);

        return sb.toString();
    }

}