package OOP_Bai13;

public class MovePoint extends Point {
    private float xSpeed, ySpeed;

    public MovePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovePoint move() {
        float newX = this.x + this.xSpeed;
        float newY = this.y + this.ySpeed;
        return new MovePoint(newX, newY, xSpeed, ySpeed);
    }

    public String toString() {
        return "X : " + String.format("%.2f", this.x) +
                "\nY : " + String.format("%.2f", this.y) +
                "\nX Speed : " + String.format("%.2f", this.xSpeed) +
                "\nY Speed : " + String.format("%.2f", this.ySpeed) +
                "\n-------------------";
    }
}
