package OOP_Bai16;

import OOP_Bai13.Point;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void Move(int n) {
        for (int i = 0; i < n; i++) {

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<MovablePoint> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt(), y = sc.nextInt();
            int xSpeed = sc.nextInt(), ySpeed = sc.nextInt();
            MovablePoint point = new MovablePoint(x, y, xSpeed, ySpeed);

            int t = sc.nextInt();
            while (t-- > 0) {
                String move = sc.next();
                if (move.equals("Down")) point.moveDown();
                else if (move.equals("Left")) point.moveLeft();
                else if (move.equals("Right")) point.moveRight();
                else point.moveUp();
            }
            list.add(point);
        }

        for (MovablePoint x : list)
            System.out.println(x);

    }
}
