package OOP_Bai14;

public class Square extends Rectangle {

    public Square(String color, boolean filled, double width, double height) {
        super(color, filled, width, height);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    public String toString() {
        return
                "-----------------------\n" +
                "Side : " + String.format("%.2f", this.width) + "\n" +
                "Color : " + this.color + "\n" +
                "Filled : " + this.filled + "\n" +
                "Perimeter : " + String.format("%.2f", this.getPerimeter()) + "\n" +
                "Area : " + String.format("%.2f", this.getArea()) + "\n" +
                "-----------------------";
    }
}
