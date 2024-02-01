import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B5 {
    public static long factorial(int x) {
        if(x == 0 ) return 1 ;
        long res = 1;
        for (int i = 1; i <= x; i++) res *= i;
        return res;
    }

    public static long combination(int k, int n) {
        return (long) factorial(n) / (long) (factorial(k) * factorial(n - k));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(combination(j, i) + " ");
            }
            System.out.println();
        }
    }
}
