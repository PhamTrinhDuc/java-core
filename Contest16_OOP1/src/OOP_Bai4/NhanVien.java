package OOP_Bai4;

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

    public String toString() {
        return "00001 " + name + " " + gender + " " + birth + " " + add + " " + mathue + " " + hd;
    }
}
