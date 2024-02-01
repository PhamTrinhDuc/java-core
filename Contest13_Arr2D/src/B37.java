import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n + 5][n + 5];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) a[i][j] = sc.nextInt();
        }
        int[][] F = new int[n + 5][n + 5];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i >= 1 && i <= n && j >= 1 && j <= n) {
                    F[j][i] = Math.max(F[j + 1][i - 1], Math.max(F[j][i - 1], F[j - 1][i - 1])) + a[j][i];
                }
            }
        }
        int res = -1;
        for (int i = 1; i <= n; i++) {
            res = Math.max(res, F[i][n]);
        }
        System.out.println(res);
    }
}
