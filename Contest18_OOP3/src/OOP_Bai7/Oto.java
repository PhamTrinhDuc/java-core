package OOP_Bai7;

import java.util.ArrayList;

public class Oto extends Vehicle {
    private int maLuc, giaBan;
    public static ArrayList<Oto> listOto = new ArrayList<>();

    public Oto(String ma, String tenXe, String hang, String maSac, int maLuc, int giaBan) {
        super(ma, tenXe, hang, maSac);
        this.maLuc = maLuc;
        this.giaBan = giaBan;
        listOto.add(this);
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.maLuc + " " + this.giaBan;
    }
}
