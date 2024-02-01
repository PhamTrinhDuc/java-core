package OOP_Bai12;

import java.util.ArrayList;
import java.util.concurrent.CompletionStage;

public class Staff extends Person implements Comparable<Staff> {
    private String school;
    private double pay;

    public Staff() {
    }

    public Staff(String name, String add, String school, double pay) {
        super(name, add);
        this.school = school;
        this.pay = pay;
    }

    public int compareTo(Staff other) {
        if (other.pay != this.pay) {
            if (this.pay < other.pay) return 1;
            else return -1;
        }
        return other.getName().compareTo(this.getName());
    }

    public String toString() {
        return "Full Name : " + this.getName() + "\n"
                + "Address : " + this.getAdd() + "\n"
                + "School : " + this.school + "\n"
                + "Pay : " + (int)this.pay + "\n"
                + "-----------------";
    }
}
