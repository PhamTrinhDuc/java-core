package OOP_Bai9;

public class SalaryOfTeacher {
    private String maGiaoVien, hoTen;
    private int Salary;

    SalaryOfTeacher(String maGiaoVien, String hoTen, int Salary) {
        this.maGiaoVien = maGiaoVien;
        this.hoTen = hoTen;
        this.Salary = Salary;
    }

    public int tinhBacLuong() {
        String hs = maGiaoVien.substring(maGiaoVien.length() - 2);
        return Integer.parseInt(hs);
    }

    public int tinhThuNhap() {
        String chucVu = maGiaoVien.substring(0, 2);
        int hSo = tinhBacLuong();
        if (chucVu.equals("HT"))
            return Salary * hSo + 2000000;
        else if (chucVu.equals("HP"))
            return Salary * hSo + 900000;
        return Salary * hSo + 500000;
    }

    public String toString() {
        int hSo = tinhBacLuong();
        int thuNhap = tinhThuNhap();
        return maGiaoVien + " " + hoTen + " " + hSo + " " + thuNhap;
    }
}
