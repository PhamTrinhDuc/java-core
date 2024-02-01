package OOP_Bai10;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student {
    private String lop, name, khoa;
    private ArrayList<Subject> listSubject;
    public static ArrayList<Student> listSudent = new ArrayList<>();

    public Student(String lop, ArrayList<Subject> listSubject, String name, String khoa) {
        this.lop = lop;
        this.name = name;
        this.khoa = khoa;
        this.listSubject = new ArrayList<>(listSubject);
        listSudent.add(this);
    }

    public double getGPA() {
        double tongDiem = 0.0;
        int tongSoTinChi = 0;
        for (int i = 0; i < listSubject.size(); i++) {
            int tinChi = listSubject.get(i).getSoTinChi();
            double diem = listSubject.get(i).getDiem();
            System.out.println(tinChi + " " + diem);
            tongDiem += tinChi * diem;
            tongSoTinChi += tinChi;
        }
        double gpa = tongDiem / tongSoTinChi;
        return gpa;
    }

    public static void sapXepSV() {
        Collections.sort(listSudent, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getGPA() != o2.getGPA()) {
                    if (o1.getGPA() > o2.getGPA()) return -1;
                    else return 1;
                }
                return o1.lop.compareTo(o2.lop);
            }
        });
    }

    public String toString() {
        getGPA();
        return this.lop + " " + this.name + " " + this.khoa + " " + String.format("%.2f", this.getGPA()) + "\n" + "------------------------";
    }
}
