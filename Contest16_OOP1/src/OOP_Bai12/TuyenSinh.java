package OOP_Bai12;

public class TuyenSinh {
    private String maThiSinh, name;
    private double d1, d2, d3;

    TuyenSinh() {
    }

    TuyenSinh(String maThiSinh, String name, double d1, double d2, double d3) {
        this.maThiSinh = maThiSinh;
        this.name = name;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public int getKhuVuc() {
        return maThiSinh.charAt(2) - '0';
    }

    public double getTongDiem() {
        int khuVuc = getKhuVuc();
        double tongDiem = this.d1 + this.d2 + this.d3;
        if (khuVuc == 1) return tongDiem + 0.5;
        else if (khuVuc == 2) return tongDiem + 1;
        return tongDiem + 2.5;
    }

    public String getTrangThai(){
        double tongDiem = getTongDiem();
        if(tongDiem >= 24) return "TRUNG TUYEN";
        return "TRUOT";
    }
    public String toString() {
        double tongDiem = getTongDiem();
        String tmp = (tongDiem == (int) tongDiem) ? String.format("%.0f", tongDiem) : String.format("%.1f", tongDiem);
        return this.maThiSinh + " " + this.name + " " + getKhuVuc() + " " + tmp + " " + getTrangThai();
    }
}
