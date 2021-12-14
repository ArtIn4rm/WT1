package com.company.oop.task12;
import java.util.Objects;

public class ProgrammerBook extends  Book{
    private String language;
    private int level;



    public ProgrammerBook(String title, String author, int price, int edition, String language, int level,String isbn) {
        super(title, author, price, edition,isbn);
        this.setLanguage(language);
        this.setLevel(level);
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
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

        ProgrammerBook guest = (ProgrammerBook) obj;
        return getTitle() == guest.getTitle()
                && getAuthor() == guest.getAuthor()
                && getPrice() == guest.getPrice()
                && getEdition() == guest.getEdition()
                && getLevel() == guest.getLevel()
                && getLanguage() == guest.getLanguage()
                &&getISBN() == guest.getISBN();
    }

    @Override
    public int hashCode() {
        return  Objects.hashCode(this);
    }

    @Override
    public String toString() {
        return "Book [title=" + getTitle()
                + ", author=" + getAuthor()
                + ", price=" + getPrice()
                + ", edition=" + getEdition()
                + ", language=" + getLanguage()
                + ", level=" + getLevel()
                + ", isbn = "+getISBN()+"]";
    }



}
