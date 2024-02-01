package OOP_Bai16;

public class MovablePoint implements Movable {
    private int x, y;
    private int xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUp() {
        this.y -= this.ySpeed;
    }

    @Override
    public void moveDown() {
        this.y += this.ySpeed;
    }

    @Override
    public void moveRight() {
        this.x += this.xSpeed;
    }

    public void moveLeft() {
        this.x -= this.xSpeed;
    }

    public String toString() {
        return this.x + " " + this.y;
    }
}
