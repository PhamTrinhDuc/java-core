package OOP_Bai9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.Callable;

public class Book {
    private String name;
    private ArrayList<Author> authors = new ArrayList<>();
    public static ArrayList<Book> listBook = new ArrayList<>();
    private double price;
    private int qty;
    public Book(){};

    public Book(String name, ArrayList<Author> authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
        listBook.add(this);
    }

    public static void sapXep() {
        Collections.sort(listBook, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.name.compareTo(o2.name);
            }
        });
    }

    public void showInfor() {
        System.out.println("-----------------------\nBook information :\n" + "Name : " + this.name + "\n" +
                "Price : " + (int)this.price + "\n" + "Quantity : " + this.qty + "\n" +
                "Author information :");
        for (int i = 0; i < authors.size(); i++) {
            System.out.println("#" + (i + 1));
            System.out.println(authors.get(i));
        }
    }
}
