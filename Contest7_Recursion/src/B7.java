import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B7 {
    public static int[][] F = new int[15][15];

    public static int nCk(int n, int k) {
        if (k == 0 || k == n) return 1;
        k = Math.min(k, n - k);
        if (F[n][k] != 0)
            return F[n][k];
        F[n][k] = nCk(n - 1, k - 1) + nCk(n - 1, k);
        return F[n][k];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(nCk(n, k));

    }
}
