package OOP_Bai22;

import java.util.ArrayList;

public class SinhVien {
    private String ma, name, lop, birth;
    private double gpa;
    public static ArrayList<SinhVien> listSinhVien = new ArrayList<>();
    private static int cnt = 0;

    SinhVien(String name, String lop, String birth, double gpa) {
        cnt++;
        this.ma = String.format("SV%03d", cnt);
        this.name = name;
        this.lop = lop;
        this.birth = birth;
        this.gpa = gpa;
        listSinhVien.add(this);
    }

    private String transformBirth() {
        StringBuilder sb = new StringBuilder(this.birth);
        if (sb.charAt(1) == '/') sb.insert(0, "0");
        if (sb.charAt(4) == '/') sb.insert(3, "0");
        return sb.toString();
    }

    public String toString() {
        return this.ma + " " + this.name + " " + this.lop + " " + this.transformBirth() + " " + String.format("%.2f", this.gpa);
    }

    public static void xuatSinhVien() {
        for (SinhVien x : listSinhVien) {
            System.out.println(x);
        }
    }
}
