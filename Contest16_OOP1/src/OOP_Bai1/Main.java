package OOP_Bai1;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        PhanSo x = new PhanSo(a, b);
        x.solve();
        System.out.println(x);
    }
}
