package OOP_Bai13;

import java.util.Scanner;

public class Main {
    public static MovePoint moveTimes(MovePoint a, int times) {
        for (int i = 0; i < times; i++) {
            a = a.move();
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            MovePoint movePoint = new MovePoint(sc.nextFloat(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
            int time = sc.nextInt();
            movePoint = moveTimes(movePoint, time);
            System.out.println(movePoint);
        }
    }
}
