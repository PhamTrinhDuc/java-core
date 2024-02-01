package OOP_Bai12;

import java.util.ArrayList;

public class Student extends Person implements Comparable<Student> {
    private String program;
    private int year;
    private double fee;

    public Student() {
    }

    public Student(String name, String add, String program, int year, double fee) {
        super(name, add);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public int compareTo(Student other) {
        if (this.fee != other.fee) {
            if (this.fee < other.fee) return 1;
            else return -1;
        }
        return this.getName().compareTo(other.getName());
    }

    public String toString() {
        return "Full Name : " + this.getName() + "\n"
                + "Address : " + this.getAdd() + "\n"
                + "Program : " + this.program + "\n"
                + "Year : " + this.year + "\n"
                + "Fee : " + (int)this.fee + " $ \n"
                + "-----------------";
    }
}
