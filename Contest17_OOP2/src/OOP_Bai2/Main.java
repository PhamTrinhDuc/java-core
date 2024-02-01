package OOP_Bai2;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            BankAccount acc = new BankAccount(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt());
        }
        int q = sc.nextInt();
        while (q-- > 0) {
//            sc.nextLine();
            String mode = sc.next();
            if (mode.equals("transfer")) {
                BankAccount.transfer(sc.next(), sc.next(), sc.nextInt());
            } else if (mode.equals("deposit")) {
                BankAccount.deposit(sc.next(), sc.nextInt());
            } else {
                BankAccount.withdraw(sc.next(), sc.nextInt());
            }
        }
        for (BankAccount x : BankAccount.listAccount)
            System.out.println(x);

    }
}
