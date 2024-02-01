import java.util.Scanner;
import java.lang.Math;
import java.io.*;
import java.util.*;

public class B8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println((long) a * b);
        if (b == 0) System.out.println("INVALID");
        else System.out.printf("%.4f", (double)a / b);
    }
}
