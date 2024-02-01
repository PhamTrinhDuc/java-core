package OOP_Bai4;


import java.util.ArrayList;

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

    public String getDiaChi(){
        return this.diaChi;
    }

    public String toString() {
        return super.toString() + " " + this.lop + " " + String.format("%.2f", this.gpa);
    }
}