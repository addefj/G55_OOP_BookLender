package se.lexicon;

import se.lexicon.model.Book;
import se.lexicon.model.Person;

import java.util.UUID;

public class App {
    public static void main(String[] args) {
        // todo: needs completion
        // Initialize and display Book & Person instances
        // Simulate borrowing a book
        // Simulate returning a book

        //creating 3 new persons
        Person karl = new Person("Kalle", "Kula");
        Person johnny = new Person("Johnny", "Bravo");
        Person marco = new Person("Marco", "Polo");

        //Creating first book
        Book book1 = new Book("Mio min Mio", "Astrid Lindgren");
        Book book2 = new Book("Häxan och Lejonet", "C.S.Lewis");
        Book book3 = new Book("A Feast for Crows", "George R.R. Martin");

        System.out.println();//new line for readability

        //get information for all books
        System.out.println("All books in the library:");
        System.out.println(book1.getBookInformation());
        System.out.println(book2.getBookInformation());
        System.out.println(book3.getBookInformation());

        System.out.println();//new line for readability

        //All persons registered at the library
        System.out.println("Registered persons");
        System.out.println(karl.getPersonInformation());
        System.out.println(johnny.getPersonInformation());
        System.out.println(marco.getPersonInformation());






    }

}
