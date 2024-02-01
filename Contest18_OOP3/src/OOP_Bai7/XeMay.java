package OOP_Bai7;

import java.util.ArrayList;

public class XeMay extends Vehicle {
    private int maxSpeed, giaBan;
    public static ArrayList<XeMay> listXeMay = new ArrayList<>();


    public XeMay(String ma, String tenXe, String hang, String maSac, int maxSpeed, int giaBan) {
        super(ma, tenXe, hang, maSac);
        this.giaBan = giaBan;
        this.maxSpeed = maxSpeed;
        listXeMay.add(this);
    }

    public String toString() {
        return super.toString() + " " + this.maxSpeed + " " + this.giaBan;
    }
}
