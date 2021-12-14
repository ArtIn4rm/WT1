package com.company.oop.task12;
import java.util.Comparator;

public class BookNameComparator implements Comparator<Book> {

    public  int compare(Book a, Book b){
        int res = a.getTitle().compareTo(b.getTitle());
        if (res == 0)
            res = a.getAuthor().compareTo(b.getAuthor());
        return  res;
    }

}
