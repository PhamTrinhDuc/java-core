package OOP_Bai5;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

    public static void sapXepGV() {
        Collections.sort(listTeacher, new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                if (o2.luong != o1.luong)
                    return o2.luong - o1.luong;
                return o1.ma.compareTo(o2.ma);
            }
        });
    }

    public String toString() {
        return super.toString() + " " + this.khoa + " " + this.luong;
    }
}