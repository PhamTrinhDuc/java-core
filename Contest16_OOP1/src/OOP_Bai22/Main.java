package OOP_Bai22;

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
            SinhVien sv = new SinhVien(sc.nextLine(), sc.next(), sc.next(), sc.nextDouble());
        }
        SinhVien.xuatSinhVien();
    }
}
