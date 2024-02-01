import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B36 {
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
                F[i][j] = Math.max(F[i - 1][j - 1], Math.max(F[i - 1][j], F[i - 1][j + 1])) + a[i][j];
            }
        }
        int res = -1;
        for (int j = 1; j <= n; j++) {
            res = Math.max(F[n][j], res);
        }
        System.out.println(res);
    }
}
