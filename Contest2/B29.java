import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.io.*;
import java.util.*;

public class B29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        if (b % a == 0 || a % b == 0) {
            double cb = (double) b / a;
            if (b * cb == c && c * cb == d){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
        else System.out.println("NO");
    }
}
