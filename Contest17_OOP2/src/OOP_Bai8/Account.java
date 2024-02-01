package OOP_Bai8;

import java.util.ArrayList;
import java.util.Scanner;

public class Account {
    private Customer customer;
    private String ID;
    private double balance;
    public static ArrayList<Account> listAccount = new ArrayList<>();

    public Account(String ID, Customer customer, double balance) {
        this.ID = ID;
        this.customer = customer;
        this.balance = balance;
        listAccount.add(this);
    }

    public void Transaction(Scanner sc) {
//        System.out.println(this.balance);
        String mode = sc.nextLine();
        int z = sc.nextInt();
        sc.nextLine();
        if (mode.equals("withdraw")) {
            if (this.balance - z >= 50) {
                this.balance -= z;
                System.out.println("transaction successful");
            } else System.out.println("amount withdrawn exceeds the current balance!");
        } else {
            System.out.println("transaction successful");
            this.balance += z;
        }
    }

    public String toString() {
        return "-------------------\n" + customer.toString() + "\n" + this.ID + "\n" + "Balance : " + String.format("%.2f", this.balance) + " $";
    }
}
