package com.dci.records;

public record Book(String title, Author author, double price, int publicationYear) implements Comparable<Book> {
    static void compareBooksByPrice(Book book1, Book book2) {
        int result = book1.compareTo(book2);
        if (result < 0) {
            System.out.println(book1.title() + " is cheaper than " + book2.title());
        } else if (result > 0) {
            System.out.println(book1.title() + " is more expensive than " + book2.title());
        } else {
            System.out.println("Books costs the same price.");
        }
    }

    double discountedPrice(double discountPercentage) {
        return discountPercentage / 100.0 * price;
    }

    @Override
    public int compareTo(Book o) {
        return Double.compare(price, o.price());
    }

    @Override
    public double price() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", price=" + price +
                ", publicationYear=" + publicationYear +
                '}';
    }
}
