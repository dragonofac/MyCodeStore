package com.blogsys.supporter.Domain;

/**
 * Created by mzlin on 14-12-15.
 */
public class BookInfo {
    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String bookname;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String author;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String ISBN;

    @Override
    public String toString(){
        return getBookname() + " " + getAuthor() + " " + getISBN();
    }

}
