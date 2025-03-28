package se.lexicon.model;
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


    //constructor
    public Person (String firstName, String lastName){
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
        if(firstName == null || firstName.isEmpty()) throw new IllegalArgumentException("can't be null or empty");
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if(lastName == null || firstName.isEmpty()) throw new IllegalArgumentException("can't be null or empty");
        this.lastName = lastName;
    }

    //other methods
    private static int getNextId(){
        return ++sequencer;
    }

    public void loanBook(Book book){

    }

    public void returnBook(Book book){
    }


    public String getPersonInformation(){
        StringBuilder sb = new StringBuilder();
        sb.append("Id: ").append(id).append(", Name: ")
                .append(firstName).append(" ").append(lastName)
                .append(", Borrowed books: ");

        return sb.toString();
    }


}