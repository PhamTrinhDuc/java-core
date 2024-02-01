package OOP_Bai11;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ma = sc.nextLine();
        int luong = sc.nextInt();
        int day = sc.nextInt();
        sc.nextLine();
        String chucVu = sc.nextLine();
        LuongNV x = new LuongNV(ma, luong, day, chucVu);
        System.out.println(x);
    }
}
