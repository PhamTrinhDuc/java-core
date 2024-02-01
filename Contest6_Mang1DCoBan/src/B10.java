import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B10 {
    public static boolean Check(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return n > 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        int tmp = a[0];
        for (int i = 1; i < n - 1; i++) {
            if (Check(tmp) && Check(sum - tmp - a[i])) {
                System.out.print(i + " ");
            }
            tmp += a[i];
        }
    }
}
