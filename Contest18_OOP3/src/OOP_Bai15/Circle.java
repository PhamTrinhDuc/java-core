package OOP_Bai15;

import java.util.Objects;

public class Circle implements GeometricObject {
    private double radius;

    public Circle(double radius) {

        this.radius = radius;
    }

    @Override
    public double getArea() {

        return 3.14 * this.radius * this.radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * 3.14 * this.radius;
    }
    @Override
    public String toString() {
        return "-----------------------\n" +
                "Radius : " +  String.format("%.02f", radius) +
                "\nPerimeter : " + String.format("%.02f", this.getPerimeter())
                + "\nArea : " + String.format("%.02f", this.getArea()) +
                "\n-----------------------";
    }
}
