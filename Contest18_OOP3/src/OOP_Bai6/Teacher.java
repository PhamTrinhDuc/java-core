package OOP_Bai6;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

    //    public static void sapXepGV() {
//        Collections.sort(listTeacher, new Comparator<Teacher>() {
//            @Override
//            public int compare(Teacher o1, Teacher o2) {
//                if (Integer.parseInt(o2.luong) != Integer.parseInt(o1.luong))
//                    return Integer.parseInt(o2.luong) - Integer.parseInt(o1.luong);
//                return o1.ma.compareTo(o2.ma);
//            }
//        });
//    }
    public String getLopPhuTrach() {
        return this.lopPhuTrach;
    }

    public String toString() {
        return super.toString() + " " + this.khoa + " " + this.luong + " " + this.lopPhuTrach;
    }
}