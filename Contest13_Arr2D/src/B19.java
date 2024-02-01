import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n + 5][m + 5];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) a[i][j] = sc.nextInt();
        }
        long sum = 0;
        long[][] F = new long[n + 5][m + 5];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1) F[i][j] = F[i][j - 1] + a[i][j]; // di sang phai
                else if (j == 1) F[i][j] = F[i - 1][j] + a[i][j]; // di xuong duoi
                else F[i][j] = Math.max(F[i - 1][j], F[i][j - 1]) + a[i][j]; // xuong duoi or sang phai
            }
        }
        System.out.println(F[n][m]);
    }

}
