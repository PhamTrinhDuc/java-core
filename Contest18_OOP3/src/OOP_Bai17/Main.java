package OOP_Bai17;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<MovableCircle> arr = new ArrayList<>();
        for (int i = 0; i < t; ++i) {
            MovableCircle m = new MovableCircle(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
            int n = sc.nextInt();
            sc.nextLine();
            for (int j = 0; j < n; ++j) {
                String s = sc.next();
                if (s.equals("Down")) {
                    m.moveDown();
                } else if (s.equals("Up")) {
                    m.moveUp();
                } else if (s.equals("Right")) {
                    m.moveRight();
                } else {
                    m.moveLeft();
                }
            }
            arr.add(m);
        }
        for (MovableCircle x : arr) {
            System.out.println(x);
        }
    }
}