package OOP_Bai20;

import java.util.ArrayList;

public class Time {
    private int h, p, s;

    public Time(int h, int p, int s) {
        this.h = h;
        this.p = p;
        this.s = s;
    }

    public int toSeconds() {
        return this.h * 60 * 60 + this.p * 60 + this.s;
    }

    public String toString() {
        return h + " " + p + " " + s;
    }
}
