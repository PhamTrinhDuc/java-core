import java.util.Scanner;
import java.lang.Math;
import java.io.*;
import java.util.*;

public class B8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int b = sc.nextInt();
        int a = sc.nextInt();

        System.out.println(a/b);
        System.out.printf("%.2f" , (float)a/b);
    }
}
