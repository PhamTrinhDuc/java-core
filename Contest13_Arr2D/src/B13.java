import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        int[][] a = new int[n][m];
        int[][] b = new int[m][p];
        long[][] c = new long[n][p];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) a[i][j] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) b[i][j] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                c[i][j] = 0;
                for (int k = 0; k < m; k++) {
                    c[i][j] += (long) a[i][k] * b[k][j];
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
