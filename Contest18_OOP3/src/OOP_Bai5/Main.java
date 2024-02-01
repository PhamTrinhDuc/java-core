package OOP_Bai5;

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
            if (ma.charAt(0) == 'S') {
                Student student = new Student(ma, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            } else {
                Teacher teacher = new Teacher(ma, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt());
            }
        }
        Student.sapXepSV();
        Teacher.sapXepGV();
        System.out.println("DANH SACH GIAO VIEN :");
        for (Teacher x : Teacher.listTeacher) {
            System.out.println(x);
        }
        System.out.println("DANH SACH SINH VIEN :");
        for (Student x : Student.listStudent) {
            System.out.println(x);
        }
    }
}
