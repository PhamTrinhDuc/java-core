package OOP_Bai5;

public class Person {
    protected String ma, hoTen, ngaySinh, diaChi;

    public Person(String ma, String hoTen, String ngaySinh, String diaChi) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String transformName() {
        String res = "";
        this.hoTen = this.hoTen.toLowerCase();
        String[] arr = this.hoTen.trim().split("\\s+");
        for (String x : arr) {
            res += Character.toUpperCase(x.charAt(0)) + x.substring(1) + " ";
        }
        return res.trim();
    }

    public String transformNS() {
        StringBuilder sb = new StringBuilder(this.ngaySinh);
        if (sb.charAt(1) == '/') sb.insert(0, "0");
        if (sb.charAt(4) == '/') sb.insert(3, "0");
        return sb.toString();
    }

    public String toString() {
        return this.ma + " " + this.transformName() + " " + this.transformNS() + " " + this.diaChi;
    }
}
