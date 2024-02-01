package OOP_Bai15;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Circle> listCircle = new ArrayList<>();
        ArrayList<Rectangle> listRectangle = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            char type = sc.next().charAt(0);
            if (type == 'C') {
                listCircle.add(new Circle(sc.nextDouble()));
            } else {
                double w = sc.nextDouble();
                double h = sc.nextDouble();
                listRectangle.add(new Rectangle(Math.min(w, h), Math.max(w, h)));
            }
        }
        System.out.println("Circle : ");
        for (Circle x : listCircle) System.out.println(x);
        System.out.println("Rectangle :");
        for (Rectangle x : listRectangle)
            System.out.println(x);
    }
}
