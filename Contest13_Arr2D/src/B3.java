import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        int min_val = Integer.MAX_VALUE, max_val = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
                max_val = Math.max(max_val, a[i][j]);
                min_val = Math.min(min_val, a[i][j]);
            }
        }
        System.out.println(min_val);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == min_val) {
                    System.out.println((i + 1) + " " + (j + 1));
                }
            }
        }
        System.out.println(max_val);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == max_val)
                    System.out.println((i + 1) + " " + (j + 1));
            }
        }
    }
}
