import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n + 5][n + 5];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) a[i][j] = sc.nextInt();
        }
        int res = -1;
        for (int i = 1; i <= n - 2; i++) {
            for (int j = 1; j <= n - 2; j++) {
                int sum = 0;
                for (int h = i; h <= i + 2; h++) {
                    for (int c = j; c <= j + 2; c++) {
                        sum += a[h][c];
                    }
                }
                res = Math.max(res, sum);
            }
        }
        System.out.println(res);
    }
}
