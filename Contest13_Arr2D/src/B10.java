import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B10 {
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
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (check(a[i][i])) set.add(a[i][i]);
            if (check(a[i][n - i - 1])) set.add(a[i][n - i - 1]);
        }
        System.out.println(set.size());
    }
}
