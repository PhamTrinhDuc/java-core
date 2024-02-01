package OOP_Bai10;

import java.util.ArrayList;

public class Subject {
    private String name;
    private int soTinChi;
    private double diem;
    public static ArrayList<Subject> listSubject = new ArrayList<>();

    public Subject(String name, int soTinChi, double diem) {
        this.name = name;
        this.soTinChi = soTinChi;
        this.diem = diem;
        listSubject.add(this);
    }

    public double getDiem() {
        return this.diem;
    }

    public int getSoTinChi() {
        return this.soTinChi;
    }
}
