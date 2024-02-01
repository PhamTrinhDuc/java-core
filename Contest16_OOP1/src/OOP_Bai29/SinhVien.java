package OOP_Bai29;

public class SinhVien {
    private String ma, name, lop, mail;

    public SinhVien(String ma, String name, String lop, String mail) {
        this.ma = ma;
        this.name = name;
        this.lop = lop;
        this.mail = mail;
    }

    public String getMa() {
        return this.ma;
    }

    public String getLop() {
        return this.lop;
    }

    public String toString() {
        return this.ma + " " + this.name + " " + this.lop + " " + this.mail;
    }
}
