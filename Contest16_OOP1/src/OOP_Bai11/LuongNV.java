package OOP_Bai11;

public class LuongNV {
    private String name;
    private int salary, day;
    private String chucVu;

    LuongNV(String name, int salary, int day, String chucVu) {
        this.name = name;
        this.salary = salary;
        this.day = day;
        this.chucVu = chucVu;
    }

    public int getLuongThang() {
        return salary * day;
    }

    public int getThuong() {
        int luongThang = getLuongThang();
        if (day >= 25) return (int) (0.2 * luongThang);
        else if (day < 25 && day >= 22) return (int) (0.1 * luongThang);
        return 0;
    }

    public int getPhuCap() {
        if (chucVu.equals("GD")) return 250000;
        else if (chucVu.equals("PGD")) return 200000;
        else if (chucVu.equals("TP")) return 180000;
        return 150000;
    }

    public int getThuNhap() {
        return getLuongThang() + getPhuCap() + getThuong();
    }

    public String toString() {
        return "NV01 " + name + " " + getLuongThang() + " " + getThuong() + " " + getPhuCap() + " " + getThuNhap();
    }
}
