import java.util.Scanner;
import java.lang.Math;
import java.io.*;
import java.util.*;
public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("%.2f\n" , Math.sqrt(n) ) ;
        System.out.printf("%.3f" , Math.pow(n , 1.0/3 ));
    }
}
