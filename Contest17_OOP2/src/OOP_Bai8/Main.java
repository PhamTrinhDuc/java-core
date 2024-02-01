package OOP_Bai8;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cusID = sc.nextLine();
        String name = sc.nextLine();
        String gender = sc.nextLine();
        String accID = sc.nextLine();
        String balance = sc.nextLine();
        String tmp = sc.nextLine();

        double soDu = Double.parseDouble(balance.substring(10, balance.length() - 2));
        Customer customer = new Customer(name, cusID, gender);
        Account acc = new Account(accID, customer, soDu);

        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            acc.Transaction(sc);
        }
        System.out.println(acc);
    }
}
