package OOP_Bai15;

public class Rectangle implements GeometricObject {
    private double width;
    private double height;

    Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.height * this.width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    public String toString() {
        return "-----------------------" +
                "\nWidth : " + String.format("%.2f", this.width) +
                "\nLength : " + String.format("%.2f", this.height) +
                "\nPerimeter : " + String.format("%.2f", this.getPerimeter()) +
                "\nArea : " + String.format("%.2f", this.getArea()) +
                "\n-----------------------";
    }
}
