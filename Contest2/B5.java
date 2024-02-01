import java.util.Scanner;
import java.lang.Math;
import java.io.*;
import java.util.*;
public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt() ;
        int y1 = sc.nextInt() ;
        int x2 = sc.nextInt() ;
        int y2 = sc.nextInt() ;
        System.out.printf("%.2f", Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y2-y1,2)));
    }
}