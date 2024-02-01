package OOP_Bai11;

import java.util.ArrayList;

public class Cylinder implements Comparable<Cylinder> {
    private double height;
    private Circle day;

    public Cylinder() {
    }

    public Cylinder(double height, Circle day) {
        this.height = height;
        this.day = day;
    }

    public double getVolumn() {
        return this.day.getArea() * this.height;
    }

    public int compareTo(Cylinder t) {
        if (this.getVolumn() != t.getVolumn()) {
            if (this.getVolumn() < t.getVolumn()) return 1;
            else return -1;
        }
        return this.day.getColor().compareTo(t.day.getColor());
    }


    public String toString() {
        return "Color : " + this.day.getColor() + "\n" +
                "Height : " + String.format("%.2f", this.height) + "\n" +
                "Radius : " + String.format("%.2f", this.day.getRadius()) + "\n" +
                "Volume : " + String.format("%.2f", this.getVolumn()) + "\n" +
                "-------------------";
    }
}
