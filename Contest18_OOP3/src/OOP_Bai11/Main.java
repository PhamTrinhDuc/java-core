package OOP_Bai11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Cylinder> listCylinder = new ArrayList<>();
        while (t-- > 0) {
            String color = sc.next();
            int radius = sc.nextInt();
            int height = sc.nextInt();
            Circle circle = new Circle(radius, color);
            Cylinder cylinder = new Cylinder(height, circle);
            listCylinder.add(cylinder);
        }
        Collections.sort(listCylinder);
        for (Cylinder x : listCylinder) System.out.println(x);


    }
}
