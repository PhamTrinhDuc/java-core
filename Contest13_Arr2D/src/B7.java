import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) a[i][j] = sc.nextInt();
        }
        int h1 = sc.nextInt();
        int h2 = sc.nextInt();
        for (int j = 1; j <= n; j++) {
            int tmp = a[h1][j];
            a[h1][j] = a[h2][j];
            a[h2][j] = tmp;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}
