package OOP_Bai9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Oto extends Vehicle {
    private int maLuc, giaBan;
    public static ArrayList<Oto> listOto = new ArrayList<>();

    public Oto(String ma, String tenXe, String hang, String maSac, int maLuc, int giaBan) {
        super(ma, tenXe, hang, maSac);
        this.maLuc = maLuc;
        this.giaBan = giaBan;
        listOto.add(this);
    }

    public static void sapXepOto() {
        Collections.sort(listOto, new Comparator<Oto>() {
            @Override
            public int compare(Oto o1, Oto o2) {
                if (o1.giaBan != o2.giaBan) {
                    return o2.giaBan - o1.giaBan;
                }
                return o1.ma.compareTo(o2.ma);
            }
        });
    }

    public int getGiaBan(){
        return  this.giaBan;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.maLuc + " " + this.giaBan;
    }
}