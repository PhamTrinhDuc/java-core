package OOP_Bai8;

public class Vehicle {
    protected String ma, tenXe, hang, mauSac;

    public Vehicle(String ma, String tenXe, String hang, String maSac) {
        this.ma = ma;
        this.tenXe = tenXe;
        this.hang = hang;
        this.mauSac = maSac;
    }

    public String getHang() {
        return this.hang;
    }

    public String toString() {
        return this.ma + " " + this.tenXe + " " + this.hang + " " + this.mauSac;
    }
}
