package OOP_Bai23;

import java.util.ArrayList;

public class SinhVien {
    private String name, lop, ns, ma;
    private double gpa;
    private static int cnt = 0;
    public static ArrayList<SinhVien> listSinhVien = new ArrayList<>();

    SinhVien(String name, String lop, String ns, double gpa) {
        cnt++;
        this.ma = String.format("SV%03d", cnt);
        this.name = name;
        this.lop = lop;
        this.ns = ns;
        this.gpa = gpa;
        listSinhVien.add(this);
    }

    private String transformBirth() {
        StringBuilder sb = new StringBuilder(ns);
        if (sb.charAt(1) == '/') sb.insert(0, "0");
        if (sb.charAt(4) == '/') sb.insert(3, "0");
        return sb.toString();
    }

    private String transformName() {
        String res = "";
        name = name.toLowerCase();
        String[] arr = name.trim().split("\\s+");
        for (String x : arr) {
            res += Character.toUpperCase(x.charAt(0)) + x.substring(1) + " ";
        }
        return res.trim();
    }

    public String toString() {
        return this.ma + " " + transformName() + " " + this.lop + " " + transformBirth() + " " + String.format("%.2f", this.gpa);
    }

    public static void xuatSinhVien() {
        String res = "";
        for (SinhVien x : listSinhVien) {
            System.out.println(x);
        }
    }


}
