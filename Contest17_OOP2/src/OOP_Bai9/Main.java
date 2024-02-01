package OOP_Bai9;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String tmp = sc.nextLine();
            String tenSach = sc.nextLine();
            double price = sc.nextDouble();
            int qty = sc.nextInt();
            int n = sc.nextInt();
            sc.nextLine();
            ArrayList<Author> listAuthor = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                Author author = new Author(sc.nextLine(), sc.nextLine(), sc.nextLine());
                listAuthor.add(author);
            }
            Book book = new Book(tenSach, listAuthor, price, qty);
        }
        Book.sapXep();
        for (Book x : Book.listBook)
            x.showInfor();
    }
}
