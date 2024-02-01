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
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            String tmp = sc.nextLine();
            int idx = -1;
            for (int j = 0; j < tmp.length(); j++) {
                if (Character.isAlphabetic(tmp.charAt(j))) {
                    idx = j;
                    break;
                }
            }

            String ns = tmp.substring(0, idx);
            String diaChi = tmp.substring(idx);

            String lop = sc.nextLine();
            double gpa = sc.nextDouble();

            Student student = new Student(name, ns, diaChi, lop, gpa, i + 1);
            System.out.println(student);
        }
    }
}
