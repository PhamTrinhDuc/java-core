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
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String ma = sc.nextLine();
            if (ma.charAt(0) == 'X') {
                XeMay xeMay = new XeMay(ma, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            } else {
                Oto oto = new Oto(ma, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            }
        }
        sc.nextLine();
        Oto.sapXepOto();
        XeMay.sapXepXM();
        System.out.println("DANH SACH OTO :");
        for (Oto x : Oto.listOto) {
            System.out.println(x);
        }
        System.out.println("DANH SACH XE MAY :");
        for (XeMay x : XeMay.listXeMay) {
            System.out.println(x);
        }
    }
}
