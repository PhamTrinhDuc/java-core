package OOP_Bai34;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GiangVien {
    private String ma, name, boMon;

    public static ArrayList<GiangVien> listGiangVien = new ArrayList<>();

    public GiangVien(String name, String boMon, int stt) {
        stt++;
        this.ma = String.format("GV%02d", stt);
        this.name = name;
        this.boMon = boMon;
        listGiangVien.add(this);
    }

    public String getBoMon() {
        String res = "";
        String[] arr = this.boMon.trim().split("\\s+");
        for (String x : arr) res += Character.toUpperCase(x.charAt(0));
        return res;
    }

    public String getTen() {
        String[] arr = this.name.trim().split("\\s+");
        return arr[arr.length - 1];
    }

    public static void sapXepGV() {
        Collections.sort(listGiangVien, new Comparator<GiangVien>() {
            @Override
            public int compare(GiangVien o1, GiangVien o2) {
                if (!o1.getTen().equals(o2.getTen()))
                    return o1.getTen().compareTo(o2.getTen());
                return o1.ma.compareTo(o2.ma);
            }
        });
    }

    public String toString() {
        return this.ma + " " + this.name + " " + this.getBoMon();
    }

    public static void inDanhSach() {
        for (GiangVien x : listGiangVien)
            System.out.println(x);
    }
}
