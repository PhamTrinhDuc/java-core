import java.util.Scanner;
import java.lang.Math;
import java.io.*;
import java.util.*;

public class B14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double AvgScore = (a + b + c * 2 + d * 3) / (1 + 1 + 2 + 3);
        if (AvgScore >= 8)
            System.out.println("GIOI");
        else if (AvgScore >= 6.5 )
            System.out.println("KHA");
        else if (AvgScore >= 5 )
            System.out.println("TRUNG BINH");
        else
            System.out.println("YEU");
    }
}
