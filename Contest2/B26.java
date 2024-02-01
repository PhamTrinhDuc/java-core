import java.util.Scanner;
import java.lang.Math;
import java.io.*;
import java.util.*;

public class B26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long min1 = Math.min(a, b);
        long max1 = Math.max(a,b);
        long min2 = Math.min(c, d);
        long max2 = Math.max(c,d);
        System.out.println( Math.max(max1, max2) + " " + Math.min(min1, min2));

    }
}
