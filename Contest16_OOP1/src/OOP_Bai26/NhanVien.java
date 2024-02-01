package OOP_Bai26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class NhanVien {
    private String ma, name, gender, birth, diaChi, maThue, hopDong;
    private static int cnt = 0;
    public static ArrayList<NhanVien> listNhanVien = new ArrayList<>();
    private int ngay, thang, nam;

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
        String[] arr = this.birth.trim().split("/");
        this.ngay = Integer.parseInt(arr[0]);
        this.thang = Integer.parseInt(arr[1]);
        this.nam = Integer.parseInt(arr[2]);
    }

    public String transformDay(String day) {
        StringBuilder sb = new StringBuilder(day);
        if (sb.charAt(1) == '/') sb.insert(0, "0");
        if (sb.charAt(4) == '/') sb.insert(3, "0");
        return sb.toString();
    }


    public static void sapXepNhanVien() {
        Collections.sort(listNhanVien, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                if (o1.nam != o2.nam)
                    return o1.nam - o2.nam;
                if (o1.thang != o2.thang)
                    return o1.thang - o2.thang;
                return o1.ngay - o2.ngay;
            }
        });
    }

    public String toString() {
        return this.ma + " " + this.name + " " + this.gender + " " + this.transformDay(this.birth) + " " + this.diaChi + " " + this.maThue + " " + this.transformDay(this.hopDong);
    }

    public static void inNhanVien() {
        for (NhanVien x : listNhanVien)
            System.out.println(x);
    }
}
