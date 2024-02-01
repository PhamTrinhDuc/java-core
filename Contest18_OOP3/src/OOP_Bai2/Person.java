package OOP_Bai2;

public class Person {
    protected String name, ngaySinh, diaChi;

    public Person(String name, String ngaySinh, String diaChi) {
        this.name = name;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String transformName() {
        String res = "";
        this.name = this.name.toLowerCase();
        String[] arr = this.name.trim().split("\\s+");
        for (String x : arr) {
            res += Character.toUpperCase(x.charAt(0)) + x.substring(1) + " ";
        }
        return res.trim();
    }

    public String transformBirth() {
        StringBuilder sb = new StringBuilder(this.ngaySinh);
        if (sb.charAt(1) == '/') sb.insert(0, "0");
        if (sb.charAt(4) == '/') sb.insert(3, "0");
        return sb.toString();
    }

    public String getTen() {
        String tmp = transformName();
        String[] arr = tmp.trim().split("\\s+");
        String res = arr[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) res += " " + arr[i];
        return res;
    }

    public String toString() {

        return transformName() + " " + transformBirth() + " " + this.diaChi;
    }
}
