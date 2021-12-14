package com.company.oop.task12;

import java.util.TreeSet;

public class Program {


    public static void main(String[] args) {
        Book firstBook = new Book("Book1", "Auth1", 100, 6,"9764235235");
        Book secondBook= new Book("Book2", "Auth2", 23, 1,"8764235235");
        Book thirdBook = new Book("Book3", "Auth3", 53, 2,"87564235235");
        Book fourthBook = new Book("Book4", "Auth4", 230, 7,"4764235235");

        System.out.println("Default order");
        System.out.println(secondBook.toString());
        System.out.println(firstBook.toString());
        System.out.println(fourthBook.toString());
        System.out.println(thirdBook.toString());


        TreeSet<Book> books  = new TreeSet<Book>();

        books.add(secondBook );
        books.add(firstBook );
        books.add(fourthBook);
        books.add(thirdBook);
        System.out.println("");
        System.out.println("Default sort (isbn)");
        for (Book book: books) {
            System.out.println(book.toString());
        }

        books  = new TreeSet<Book>(new BookAuthorComparator());
        books.add(secondBook );
        books.add(firstBook );
        books.add(fourthBook);
        books.add(thirdBook);
        System.out.println("");
        System.out.println("Sort by author");
        for (Book book: books) {
            System.out.println(book.toString());
        }

        books  = new TreeSet<Book>(new BookPriceComparator());
        books.add(secondBook );
        books.add(firstBook );
        books.add(fourthBook);
        books.add(thirdBook);
        System.out.println("");
        System.out.println("Sort by price");
        for (Book book: books) {
            System.out.println(book.toString());
        }

        books  = new TreeSet<Book>(new BookNameComparator());
        books.add(secondBook );
        books.add(firstBook );
        books.add(fourthBook);
        books.add(thirdBook);
        System.out.println("");
        System.out.println("Sort by title");
        for (Book book: books) {
            System.out.println(book.toString());
        }



    }

}
