package OOP_Bai25;

import java.util.ArrayList;

public class NhanVien {
    private String ma, name, gender, birth, diaChi, maThue, hopDong;
    private static int cnt = 0;
    public static ArrayList<NhanVien> listNhanVien = new ArrayList<>();

    public NhanVien(String name, String gender, String birth, String diaChi, String maThue, String hopDong) {
        cnt++;
        this.ma = String.format("%05d", cnt);
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.diaChi = diaChi;
        this.maThue = maThue;
        this.hopDong = hopDong;
        listNhanVien.add(this);
    }

    public String transformDay(String day) {
        StringBuilder sb = new StringBuilder(day);
        if (sb.charAt(1) == '/') sb.insert(0, "0");
        if (sb.charAt(4) == '/') sb.insert(3, "0");
        return sb.toString();
    }

//    public String transformName() {
//        String res = "";
//        name = name.toLowerCase();
//        String[] arr = name.trim().split("\\s+");
//        for (String x : arr) {
//            res += Character.toUpperCase(x.charAt(0)) + x.substring(1) + " ";
//        }
//        return res.trim();
//    }

    public String toString(){
        return this.ma + " " + this.name + " " + this.gender + " " + this.transformDay(this.birth) + " " + this.diaChi + " " + this.maThue + " " + this.transformDay(this.hopDong);
    }
}
