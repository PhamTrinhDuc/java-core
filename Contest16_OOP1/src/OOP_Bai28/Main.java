package OOP_Bai28;

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
            String name = sc.nextLine();
            double[] a = new double[10];
            for (int j = 0; j < 10; j++) a[j] = sc.nextDouble();
            BangDiem bd = new BangDiem(name, a, i);
        }
        BangDiem.sapXepSV();
        BangDiem.inDanhSach();
    }
}
