import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            long sum = 0;
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
                sum += a[i][j];
            }
            System.out.print(sum + " ");
        }
        System.out.println();
        for (int j = 0; j < m; j++) {
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += a[i][j];
            }
            System.out.print(sum + " ");
        }
    }
}
