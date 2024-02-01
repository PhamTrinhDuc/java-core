package OOP_Bai6;

public class Rentange {
    private String color;
    private int width, height;

    Rentange(int width, int height, String color) {
        this.color = color;
        this.width = width;
        this.height = height;
    }

    public int findPerimeter() {
        return 2 * (width + height);
    }

    public int findArea() {
        return width * height;
    }

    public boolean check() {
        if (width <= 0 || height <= 0) return false;
        return true;
    }

    public String toString() {
        return findPerimeter() + " " + findArea() + " " + color;
    }
}
