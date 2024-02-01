package OOP_Bai6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student extends Person {
    private String lop;
    private double gpa;

    public static ArrayList<Student> listStudent = new ArrayList<>();

    public Student(String ma, String hoTen, String ngaySinh, String diaChi, String lop, double gpa) {
        super(ma, hoTen, ngaySinh, diaChi);
        this.lop = lop;
        this.gpa = gpa;
        listStudent.add(this);
    }

//    public static void sapXepSV() {
//        Collections.sort(listStudent, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                if (o1.gpa != o2.gpa) {
//                    if (o1.gpa > o2.gpa) return -1;
//                    else return 1;
//                }
//                return o1.ma.compareTo(o2.ma);
//            }
//        });
//    }

    public String getLop() {
        return this.lop;
    }

    public String toString() {
        return super.toString() + " " + this.lop + " " + String.format("%.2f", this.gpa);
    }
}