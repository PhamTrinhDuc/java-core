import java.util.Scanner;
import java.lang.Math;
import java.io.*;
import java.util.*;

public class B11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a > 0 && b > 0 && c > 0) && (a+b>c && a+c>b && b+c>a)){
            if (a == b && b == c)
                System.out.println(1);
            else if (a == b || b == c || a == c)
                System.out.println(2);
            else if (a * a + b * b == c*c || a * a + c * c == b*b || b * b + c * c == a*a)
                System.out.println(3);
            else
                System.out.println(4);
        }
        else
            System.out.println("INVALID");
    }
}
