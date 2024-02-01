package OOP_Bai2;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Student extends Person {
    private String lop, ma;
    private double gpa;
    public static ArrayList<Student> listStudent = new ArrayList<>();

    public Student(String name, String ngaySinh, String diaChi, String lop, double gpa, int cnt) {
        super(name, ngaySinh, diaChi);
        this.ma = String.format("%04d", cnt);
        this.lop = lop;
        this.gpa = gpa;
        listStudent.add(this);
    }

    public static void sapXepSV() {
        Collections.sort(listStudent, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getTen().compareTo(o2.getTen());
            }
        });
    }

    public String toString() {
        return this.ma + " " + super.toString() + " " + lop + " " + String.format("%.2f", gpa);
    }
}
