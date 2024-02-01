package OOP_Bai28;

import java.time.format.SignStyle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BangDiem {
    private String name, ma;
    private double[] bangDiem = new double[10];
    public static ArrayList<BangDiem> listbBangDiem = new ArrayList<>();

    public BangDiem(String name, double[] bangDiem, int stt) {
        stt++;
        this.ma = String.format("HS%02d", stt);
        this.name = name;
        this.bangDiem = bangDiem;
        listbBangDiem.add(this);
    }

    public double getDiemTB() {
        double res = 0;
        for (int i = 0; i < 10; i++) res += bangDiem[i];
        return res / 10;
    }

    public String getTrangThai() {
        double res = getDiemTB();
        if (res >= 9) return "XUAT SAC";
        if (res >= 8) return "GIOI";
        if (res >= 7) return "KHA";
        if (res >= 5) return "TB";
        return "YEU";
    }

    public static void sapXepSV() {
        Collections.sort(listbBangDiem, new Comparator<BangDiem>() {
            @Override
            public int compare(BangDiem o1, BangDiem o2) {
                if (o1.getDiemTB() > o2.getDiemTB()) return -1;
                return o1.ma.compareTo(o2.ma);
            }
        });
    }

    public String toString() {
        return this.ma + " " + this.name + " " + String.format("%.1f", this.getDiemTB()) + " " + this.getTrangThai();
    }

    public static void inDanhSach() {
        for (BangDiem x : listbBangDiem)
            System.out.println(x);
    }
}
