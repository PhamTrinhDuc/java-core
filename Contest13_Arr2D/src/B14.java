import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int h1 = 0, h2 = n - 1, c1 = 0, c2 = n - 1;
        int cnt = 0;
        while (h1 <= h2 && c1 <= c2) {
            for (int j = c1; j <= c2; j++) {
                cnt++;
                a[h1][j] = cnt;
            }
            h1++;
            for (int i = h1; i <= h2; i++) {
                cnt++;
                a[i][c2] = cnt;
            }
            c2--;

            if (h1 <= h2) {
                for (int j = c2; j >= c1; j--) {
                    cnt++;
                    a[h2][j] = cnt;
                }
                h2--;
            }
            if (c1 <= c2) {
                for (int i = h2; i >= h1; i--) {
                    cnt++;
                    a[i][c1] = cnt;
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
