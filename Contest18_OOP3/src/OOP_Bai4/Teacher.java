package OOP_Bai4;

import java.util.ArrayList;

public class Teacher extends Person {
    private String khoa, lopPhuTrach, luong;
    public static ArrayList<Teacher> listTeacher = new ArrayList<>();

    public Teacher(String ma, String hoTen, String ngaySinh, String diaChi, String khoa, String luong, String lopPhuTrach) {
        super(ma, hoTen, ngaySinh, diaChi);
        this.khoa = khoa;
        this.luong = luong;
        this.lopPhuTrach = lopPhuTrach;
        listTeacher.add(this);
    }

    public String getDiaChi(){
        return this.diaChi;
    }

    public String toString() {
        return super.toString() + " " + this.khoa + " " + this.luong;
    }
}

