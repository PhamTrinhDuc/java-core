package OOP_Bai13;

public class PhanSo {
    private long tu, mau;

    PhanSo() {
    }

    PhanSo(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
        this.RutGon();
    }

    private long GCD(long a, long b) {
        if (b == 0) return a;
        return GCD(b, a % b);
    }

    public void RutGon() {
        long k = GCD(this.tu, this.mau);
        this.tu /= k;
        this.mau /= k;
    }

    public PhanSo congHaiPhanSo(PhanSo b) {
        long mau = this.mau * b.mau;
        long tu = this.tu * b.mau + b.tu * this.mau;
        PhanSo tong = new PhanSo(tu, mau);
        return tong;
    }

    public PhanSo nhanHaiPhanSo(PhanSo b) {
        long tu = this.tu * b.tu;
        long mau = this.mau * b.mau;
        PhanSo tich = new PhanSo(tu, mau);
        return tich;
    }

    public String toString() {
        return this.tu + "/" + this.mau;
    }
}
