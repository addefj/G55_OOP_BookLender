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
        setTitle(title); //call method to set title
        setAuthor(author); //call method to set author
        id = UUID.randomUUID().toString(); //set a random generated Id String
        setBorrower(null); //send null, because no borrower assigned
    }

    public Book(String title, String author, Person borrower){
        this(title, author);
        setBorrower(borrower);//send borrower from parameter
    }

    //setters and getters
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
        if(borrower == null){ //if there's no borrower yet, set available to true, else false
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