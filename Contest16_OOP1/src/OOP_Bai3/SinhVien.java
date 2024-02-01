package OOP_Bai3;

public class SinhVien {
    private String name, lop, birth;
    private double gpa;

    SinhVien() {
    }

    SinhVien(String name, String lop, String birth, double gpa) {
        this.name = name;
        this.lop = lop;
        this.birth = birth;
        this.gpa = gpa;
    }

    private String transformBirth() {
        StringBuilder sb = new StringBuilder(this.birth);
        if (sb.charAt(1) == '/') sb.insert(0, "0");
        if (sb.charAt(4) == '/') sb.insert(3, "0");
        return sb.toString();
    }

    public String toString() {
        return "SV001 " + this.name + " " + this.lop + " " + transformBirth() + " " + String.format("%.1f", this.gpa);
    }
}
