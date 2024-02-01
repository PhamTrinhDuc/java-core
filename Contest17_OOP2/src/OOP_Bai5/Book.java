package OOP_Bai5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty;
    public static ArrayList<Book> listBook = new ArrayList<>();

    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
        listBook.add(this);
    }

    public static void sapXep() {
        Collections.sort(listBook, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.price != o2.price) {
                    if (o1.price > o2.price)
                        return -1;
                    else
                        return 1;
                }
                return o1.name.compareTo(o2.name);
            }
        });
    }

    public String toString() {
        return "Book Details :\n" + this.name + "\n" + (int)this.price + "\n" + this.qty + "\n" + this.author.toString();
    }

}
