package OOP_Bai13;

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
        while (t-- > 0) {
            PhanSo a = new PhanSo(sc.nextInt(), sc.nextInt());
            PhanSo b = new PhanSo(sc.nextInt(), sc.nextInt());
            PhanSo c = a.congHaiPhanSo(b).nhanHaiPhanSo(a.congHaiPhanSo(b));
            PhanSo d = a.nhanHaiPhanSo(b).nhanHaiPhanSo(c);
            System.out.println(c + " " + d);
        }
    }
}
