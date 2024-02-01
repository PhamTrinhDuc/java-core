import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B4 {
    public static boolean check(int a) {
        int rev = 0, tmp = a;
        while (a != 0) {
            rev = rev * 10 + a % 10;
            a /= 10;
        }
        return rev == tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (check(a[i][j])) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
