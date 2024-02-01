package OOP_Bai14;

public class Circle extends Shape {
    private double radius;
    private double PI = 3.14;

    Circle() {
    }

    public Circle(String color, boolean filled, double redius) {
        super(color, filled);
        this.radius = redius;
    }

    @Override
    public double getArea() {
        return this.PI * this.radius * this.radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * this.PI * this.radius;
    }

    public String toString() {
        return
                "-----------------------\n" +
                "Radius : " + String.format("%.2f", this.radius) + "\n" +
                "Color : " + this.color + "\n" +
                "Filled : " + this.filled + "\n" +
                "Perimeter : " + String.format("%.2f", this.getPerimeter()) + "\n" +
                "Area : " + String.format("%.2f", this.getArea()) + "\n" +
                "-----------------------";
    }
}
