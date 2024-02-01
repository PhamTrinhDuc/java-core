package OOP_Bai21;

import OOP_Bai19.Matrix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MatHang {
    private String ma, tenMatHang, donViTinh;
    private int giaMua, giaBan;

    private static int cnt = 0;

    public static ArrayList<MatHang> listMatHang = new ArrayList<>();

    public MatHang(String tenMatHang, String donViTinh, int giaBan, int giaMua) {
        cnt++;
        this.ma = String.format("MH%04d", cnt);
        this.tenMatHang = tenMatHang;
        this.donViTinh = donViTinh;
        this.giaBan = giaBan;
        this.giaMua = giaMua;
        listMatHang.add(this);
    }

    public static void sortMatHang() {
        Collections.sort(listMatHang, new Comparator<MatHang>() {
            @Override
            public int compare(MatHang o1, MatHang o2) {
                if (o1.getLoiNhuan() != o2.getLoiNhuan())
                    return o2.getLoiNhuan() - o1.getLoiNhuan();
                return o1.ma.compareTo(o2.ma);
            }
        });
    }

    public int getLoiNhuan() {
        return this.giaMua - this.giaBan;
    }

    public String toString() {
        return this.ma + " " + this.tenMatHang + " " + this.donViTinh + " " + this.giaBan + " " + this.giaMua + " " + this.getLoiNhuan();
    }

    public static void xuatMathang() {
        for (MatHang x : listMatHang)
            System.out.println(x);
    }
}
