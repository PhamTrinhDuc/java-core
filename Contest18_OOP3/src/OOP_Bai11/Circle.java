package OOP_Bai11;

public class Circle {
    private double radius;
    private String color;
    private double PI = 3.14;

    public Circle() {
    }

    public double getArea() {
        return this.PI * this.radius * this.radius;
    }


    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public double getRadius() {
        return this.radius;
    }
}
