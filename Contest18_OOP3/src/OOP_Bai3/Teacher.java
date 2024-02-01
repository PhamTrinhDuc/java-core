package OOP_Bai3;

import java.util.ArrayList;

public class Teacher extends Person {
    private String khoa;
    private int luong;
    public static ArrayList<Teacher> listTeacher = new ArrayList<>();

    public Teacher(String ma, String hoTen, String ngaySinh, String diaChi, String khoa, int luong) {
        super(ma, hoTen, ngaySinh, diaChi);
        this.khoa = khoa;
        this.luong = luong;
        listTeacher.add(this);
    }

    public String toString() {
        return super.toString() + " " + this.khoa + " " + this.luong;
    }
}
