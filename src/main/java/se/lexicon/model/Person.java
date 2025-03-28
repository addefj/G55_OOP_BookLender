package se.lexicon.model;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a Person model with properties and methods
 * to manage personal details and interactions with the library system.
 */
public class Person {

    //fields
    private static int sequencer = 0;
    private int id;
    private String firstName;
    private String lastName;
    private List<Book> books = new ArrayList<>(); //list to hold information of books borrowed by person

    //constructor
    public Person(String firstName, String lastName) {
        setFirstName(firstName); //call method to set first name
        setLastName(lastName); //call method to set last name
        id = getNextId(); //call method for the next id
    }

    //getters and setters
    public int getId() { //no real use, could remove
        return id;
    }

    public String getFirstName() { //no real use, could remove
        return firstName;
    }

    public String getLastName() { //no real use, could remove
        return lastName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.trim().isEmpty())
            throw new IllegalArgumentException("First name can't be null or empty");
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.trim().isEmpty())
            throw new IllegalArgumentException("Last name can't be null or empty");
        this.lastName = lastName;
    }

    //other methods
    private static int getNextId() {
        return ++sequencer; //increase sequencer before value is assigned to new persons id.
    }

    public void loanBook(Book book) {
        if (book.isAvailable()) {
            book.setBorrower(this); //sets the calling object(person) to borrower
            books.add(book); //add the loaned book to the end of the list
        } else {
            System.out.println("Book is currently unavailable");
        }
    }

    public void returnBook(Book book) {
        if (book.getBorrower() == this) { //book can only be returned if the calling object(person) is set as borrower
            book.setBorrower(null); //set borrower back to null
            books.remove(book); //removes the book from the list
        } else {
            System.out.println("This person can't return the book, as he isn't the one that borrowed it");
        }
    }

    public String getPersonInformation() {
        StringBuilder sb = new StringBuilder();
        sb.append("Id: ").append(id).append(", Name: ")
                .append(firstName).append(" ").append(lastName)
                .append(", Borrowed books:");
        if (books.isEmpty()) { //if no book is borrowed by the person
            sb.append(" None");
        } else {
            for (Book book : books) { //adds all books borrowed by the person to the stringbuilder
                sb.append(" ").append(book.getTitle()).append(", ")
                        .append(book.getAuthor()).append(".");
            }
        }

        return sb.toString();
    }


}