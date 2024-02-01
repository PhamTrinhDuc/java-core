package OOP_Bai5;

public class NhanVien {
    private String name, gender, birth, add, mathue, hd;

    NhanVien(String name, String gender, String birth, String add, String mathue, String hd) {
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.add = add;
        this.mathue = mathue;
        this.hd = hd;
    }

    private String transformDay(String day) {
        StringBuilder sb = new StringBuilder(day);
        if (sb.charAt(1) == '/') sb.insert(0, "0");
        if (sb.charAt(4) == '/') sb.insert(3, "0");
        return sb.toString();
    }

    private String transformName() {
        String res = "";
        name = name.toLowerCase();
        String[] arr = name.split("\\s+");
        for (String x : arr) {
            res += Character.toUpperCase(x.charAt(0)) + x.substring(1) + " ";
        }
        res = res.trim();
        return res;
    }

    public String toString() {
        return "00001 " + transformName() + " " + gender + " " + transformDay(birth) + " " + add + " " + mathue + " " + transformDay(hd);
    }
}
