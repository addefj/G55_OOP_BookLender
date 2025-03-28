package se.lexicon.model;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a Person model with properties and methods
 * to manage personal details and interactions with the library system.
 */
public class Person {
    // todo: needs completion

    //fields
    private static int sequencer = 0;
    private int id;
    private String firstName;
    private String lastName;
    private List<Book> books = new ArrayList<>();


    //constructor
    public Person(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
        id = getNextId();
    }

    //setters and getters
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.trim().isEmpty()) throw new IllegalArgumentException("First name can't be null or empty");
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.trim().isEmpty()) throw new IllegalArgumentException("Last name can't be null or empty");
        this.lastName = lastName;
    }

    //other methods
    private static int getNextId() {
        return ++sequencer;
    }

    public void loanBook(Book book) {
        if (book.isAvailable()) {
            book.setBorrower(this);
            books.add(book);
        }
    }

    public void returnBook(Book book) {
        if (book.getBorrower() == this) {
            book.setBorrower(null);
            books.remove(book);
        }
    }

    public String getPersonInformation() {
        StringBuilder sb = new StringBuilder();
        sb.append("Id: ").append(id).append("\nName: ")
                .append(firstName).append(" ").append(lastName)
                .append("\nBorrowed books: \n");
        for (Book book : books) {
            sb.append(book.getTitle()).append(", ")
                    .append(book.getAuthor()).append("\n");

        }

        return sb.toString();
    }


}