import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B9 {
    public static boolean check(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return n > 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (check(a[i][i])) cnt++;
            if (check(a[i][n - i - 1])) cnt++;
            if (i == n - i - 1 && check(a[i][i])) cnt--;
        }
        System.out.println(cnt);
    }
}
