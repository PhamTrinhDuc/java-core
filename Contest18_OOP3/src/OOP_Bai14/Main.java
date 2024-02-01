package OOP_Bai14;

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
        Shape[] shape = new Shape[t];
        for (int i = 0; i < t; i++) {
            String c = sc.next();
            if (c.equals("C")) {
                double R = sc.nextDouble();
                String color = sc.next();
                boolean filled = sc.nextBoolean();
                shape[i] = new Circle(color, filled, R);
            } else if (c.equals("R")) {
                double w = sc.nextDouble();
                double h = sc.nextDouble();
                String color = sc.next();
                boolean filled = sc.nextBoolean();
                shape[i] = new Rectangle(color, filled, Math.min(w, h), Math.max(w, h));
            } else {
                double side = sc.nextDouble();
                String color = sc.next();
                boolean filled = sc.nextBoolean();
                shape[i] = new Square(color, filled, side, side);
            }
        }
        System.out.println("Circle :");
        for (int i = 0; i < t; i++) {
            if (shape[i] instanceof Circle) System.out.println(shape[i]);
        }
        System.out.println("Rectangle :");
        for (int i = 0; i < t; i++) {
            if (shape[i] instanceof Rectangle && !(shape[i] instanceof Square))
                System.out.println(shape[i]);
        }
        System.out.println("Square :");
        for (int i = 0; i < t; i++) {
            if (shape[i] instanceof Square) System.out.println(shape[i]);
        }
    }
}
