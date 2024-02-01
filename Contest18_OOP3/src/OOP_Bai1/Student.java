package OOP_Bai1;

public class Student extends Person {
    private String lop, ma;
    private double gpa;

    public Student(String name, String ns, String add, String lop, double gpa, int cnt) {
        super(name, ns, add);
        this.ma = String.format("%04d", cnt);
        this.lop = lop;
        this.gpa = gpa;
    }

    public String toString() {
        return this.ma + " " + super.toString() + " " + this.lop + " " + String.format("%.2f", this.gpa);
    }
}
