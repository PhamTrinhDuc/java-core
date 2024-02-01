package OOP_Bai10;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        try {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.nextLine();
            while (n-- > 0) {
                String tmp = sc.nextLine();
                String lop = sc.nextLine();
                String name = sc.nextLine();
                String khoa = sc.nextLine();
                int t = sc.nextInt();
                sc.nextLine();
                while (t-- > 0) {
                    String mon = sc.nextLine();
                    int tinChi = sc.nextInt();
                    double diem = sc.nextDouble();
                    sc.nextLine();
                    Subject subject = new Subject(mon, tinChi, diem);
                }
                Student student = new Student(lop, Subject.listSubject, name, khoa);
                Subject.listSubject.clear();
            }
            Student.sapXepSV();
            for (Student x : Student.listSudent) {
                System.out.println(x);
                System.out.println(x.getGPA());
            }
        }catch (java.util.InputMismatchException e){
            System.out.println("Input Mismatch Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
