package com.startarget;

public class Book {
    private String bookName;
    private String bookAuthor;
    public void testDemo(){
        System.out.println("book name:"+bookName);
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
}
