package OOP_Bai6;

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
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine();
            if (ma.charAt(0) == 'S') {
                Student student = new Student(ma, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
                sc.nextLine();
            } else {
                Teacher teacher = new Teacher(ma, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            }
        }
        String lop = sc.nextLine();
        System.out.println("DANH SACH GIAO VIEN PHU TRACH LOP " + lop + " :");
        for (Teacher x : Teacher.listTeacher) {
            if (x.getLopPhuTrach().equals(lop))
                System.out.println(x);
        }
        System.out.println("DANH SACH SINH VIEN LOP " + lop + " :");
        for (Student x : Student.listStudent) {
            if (x.getLop().equals(lop))
                System.out.println(x);
        }
    }
}