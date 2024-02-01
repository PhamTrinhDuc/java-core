import java.util.Scanner;
import java.lang.Math;
import java.io.*;
import java.util.*;

public class B24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        int d3 = sc.nextInt();
        int way1 = 2 * d1 + 2 * d2;
        int way2 = d1 + d2 + d3;
        int way3 = 2 * d1 + 2 * d3;
        int way4 = 2 * d2 + 2 * d3;
        int min1 = Math.min(way1 , way2);
        int min2 = Math.min(way3, way4);
        System.out.println(Math.min(min1, min2));
    }
}
