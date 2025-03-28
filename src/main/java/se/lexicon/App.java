package se.lexicon;

import se.lexicon.model.Book;
import se.lexicon.model.Person;

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
        Book mioMinMio = new Book("Mio min Mio", "Astrid Lindgren", johnny);
        Book haxanOchLejonet = new Book("Häxan och Lejonet", "C.S.Lewis");
        Book aFeastForCrows = new Book("A Feast for Crows", "George R.R. Martin");

        System.out.println("----------------------");//new line for readability

        //get information for all books
        System.out.println("All books in the library:");
        System.out.println(mioMinMio.getBookInformation());
        System.out.println(haxanOchLejonet.getBookInformation());
        System.out.println(aFeastForCrows.getBookInformation());

        System.out.println("----------------------");//new line for readability

        //Print all persons registered at the library
        System.out.println("Registered persons");
        System.out.println(karl.getPersonInformation());
        System.out.println(johnny.getPersonInformation());
        System.out.println(marco.getPersonInformation());

        System.out.println("----------------------");//new line for readability

        //simulating a book being borrowed
        karl.loanBook(mioMinMio);
        karl.loanBook(haxanOchLejonet);
        johnny.loanBook(aFeastForCrows);

        System.out.println("Person info after books have been borrowed");
        System.out.println(karl.getPersonInformation());
        System.out.println(johnny.getPersonInformation());
        System.out.println(marco.getPersonInformation());

        System.out.println("----------------------");//new line for readability

        System.out.println("Book info after books have been borrowed");
        System.out.println(mioMinMio.getBookInformation());
        System.out.println(haxanOchLejonet.getBookInformation());
        System.out.println(aFeastForCrows.getBookInformation());

        System.out.println("----------------------");//new line for readability

        //simulate returning all books
        karl.returnBook(mioMinMio);
        karl.returnBook(haxanOchLejonet);
        johnny.returnBook(aFeastForCrows);

        System.out.println("Person info after books have been returned");
        System.out.println(karl.getPersonInformation());
        System.out.println(johnny.getPersonInformation());
        System.out.println(marco.getPersonInformation());

        System.out.println("----------------------");//new line for readability

        System.out.println("Book info after books have been returned");
        System.out.println(mioMinMio.getBookInformation());
        System.out.println(haxanOchLejonet.getBookInformation());
        System.out.println(aFeastForCrows.getBookInformation());


        //todo: add message if book couldn't be borrowed
        //todo: add personal info that no book is borrowed
        //todo: add person knowing that they borrowed a book if, book was assigned at constructor








    }

}
