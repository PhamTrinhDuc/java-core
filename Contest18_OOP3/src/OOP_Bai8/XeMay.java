package OOP_Bai8;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class XeMay extends Vehicle {
    private int maxSpeed, giaBan;
    public static ArrayList<XeMay> listXeMay = new ArrayList<>();


    public XeMay(String ma, String tenXe, String hang, String maSac, int maxSpeed, int giaBan) {
        super(ma, tenXe, hang, maSac);
        this.giaBan = giaBan;
        this.maxSpeed = maxSpeed;
        listXeMay.add(this);
    }

    public static void sapXepXM() {
        Collections.sort(listXeMay, new Comparator<XeMay>() {
            @Override
            public int compare(XeMay o1, XeMay o2) {
                if (o1.giaBan != o2.giaBan) {
                    return o2.giaBan - o1.giaBan;
                }
                return o1.ma.compareTo(o2.ma);
            }
        });
    }

    public String toString() {
        return super.toString() + " " + this.maxSpeed + " " + this.giaBan;
    }
}
