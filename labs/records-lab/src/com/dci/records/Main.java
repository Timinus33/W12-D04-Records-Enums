package com.dci.records;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Batman", new Author("Robert Downey", 1990, "german"), 1000, 2005);
        Book book2 = new Book("Spider man", new Author("George Clooney", 1992, "russian"), 30, 2003);
        Book book3 = new Book("Transformers", new Author("Tom Cruise", 1994, "american"), 1000, 2014);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        Book.compareBooksByPrice(book1, book3);

        System.out.println(book2.price() - book2.discountedPrice(10));
    }
}
