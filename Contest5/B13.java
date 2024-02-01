import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B13 {
    public static long[] F = new long[100];

    public static void Fibo() {
        F[0] = 1;
        F[1] = 1;
        for (int i = 2; i <= 92; i++) {
            F[i] = F[i - 1] + F[i - 2];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fibo();
        long n = sc.nextLong();
        for (int i = 0; i <= 92; i++) {
            if (F[i] >= n) {
                System.out.println(F[i]);
                break;
            }
        }
    }
}
