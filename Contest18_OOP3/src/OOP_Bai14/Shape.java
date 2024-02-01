package OOP_Bai14;

abstract class Shape {
    protected String color;
    protected boolean filled;

    Shape() {
    }

    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

}
