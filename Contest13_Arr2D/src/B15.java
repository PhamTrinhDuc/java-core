import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B15 {
    static long[] F = new long[100];

    static void Generate_NumberFibo() {
        F[0] = 0;
        F[1] = 1;
        for (int i = 2; i <= 92; i++) {
            F[i] = F[i - 1] + F[i - 2];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] a = new long[n][n];
        Generate_NumberFibo();
        int h1 = 0, h2 = n - 1, c1 = 0, c2 = n - 1;
        int idx = 0;
        while (h1 <= h2 && c1 <= c2) {
            for (int j = c1; j <= c2; j++) {
                a[h1][j] = F[idx++];
            }
            h1++;
            for (int i = h1; i <= h2; i++) {
                a[i][c2] = F[idx++];
            }
            c2--;
            if (c1 <= c2) {
                for (int j = c2; j >= c1; j--) {
                    a[h2][j] = F[idx++];
                }
                h2--;
            }
            if (h1 <= h2) {
                for (int i = h2; i >= h1; i--) {
                    a[i][c1] = F[idx++];
                }
                c1++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
