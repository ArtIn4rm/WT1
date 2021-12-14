package com.company.oop.task12;
import java.util.Objects;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private  String isbn;
    private int price;
    private int edition;

    public Book(String title, String author, int price, int edition,String isbn) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setPrice(price);
        this.setEdition(edition);
        this.setISBN(isbn);
    }

    public int compareTo(Book book){

        return isbn.compareTo(book.isbn);
    }


    public String getISBN() {
        return isbn;
    }

    public void setISBN(String isbn1) {
        this.isbn = isbn1;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null ||
                obj.getClass() != this.getClass()) {
            return false;
        }

        Book guest = (Book) obj;
        return getTitle() == guest.getTitle()
                && getAuthor() == guest.getAuthor()
                && getPrice() == guest.getPrice()
                && getEdition() == guest.getEdition()
                && getISBN() == guest.getISBN();
    }

    @Override
    public int hashCode() {
        return  Objects.hashCode(this);
    }

    @Override
    public String toString() {
        return "Book [ title= " + getTitle()
                + ", author= " + getAuthor()
                + ", price= " + getPrice()
                + ", edition= " + getEdition()
                + ", isbn = "+getISBN()+"]";
    }

    @Override
    public Book clone()
    {
        Book copy = new Book( title,  author,  price, edition,isbn);
        return copy;
    }


}
