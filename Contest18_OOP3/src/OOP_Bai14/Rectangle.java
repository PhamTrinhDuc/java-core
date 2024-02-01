package OOP_Bai14;

public class Rectangle extends Shape {
    protected double width;
    protected double height;

    Rectangle() {
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    public String toString() {
        return
                "-----------------------\n" +
                "Width : " + String.format("%.2f", this.width) + "\n" +
                "Length : " + String.format("%.2f", this.height) + "\n" +
                "Color : " + this.color + "\n" +
                "Filled : " + this.filled + "\n" +
                "Perimeter : " + String.format("%.2f", this.getPerimeter()) + "\n" +
                "Area : " + String.format("%.2f", this.getArea()) + "\n" +
                "-----------------------";
    }
}
