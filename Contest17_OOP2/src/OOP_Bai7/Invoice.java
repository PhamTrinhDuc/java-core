package OOP_Bai7;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Invoice {
    private String ID;
    private double amount;
    private Customer customer;
    public static ArrayList<Invoice> listInvoice = new ArrayList<>();

    public Invoice(String ID, double amount, Customer customer) {
        this.ID = ID;
        this.amount = amount;
        this.customer = customer;
        listInvoice.add(this);
    }

    public void amount() {
        this.amount -= this.amount * this.customer.getDiscount() / 100;
    }


    public static void sapXepInvoice() {
        Collections.sort(listInvoice, new Comparator<Invoice>() {
            @Override
            public int compare(Invoice o1, Invoice o2) {
                if (o1.amount != o2.amount) {
                    if (o1.amount > o2.amount) return -1;
                    else return 1;
                }
                return o1.customer.getID() - (o2.customer.getID());
            }
        });
    }

    public String toString() {
        return customer.toString() + "Amount : " + String.format("%.2f", this.amount) + " $\n" + "--------------------";
    }
}
