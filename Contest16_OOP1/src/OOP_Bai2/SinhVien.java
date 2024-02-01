package OOP_Bai2;

public class SinhVien {
    private String name, birth;
    private double d1, d2, d3;

    SinhVien() {
    }

    SinhVien(String name, String birth, double d1, double d2, double d3) {
        this.name = name;
        this.birth = birth;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public String toString() {
        return this.name + " " + this.birth + " " + String.format("%.1f", this.d1 + this.d2 + this.d3);
    }
}
