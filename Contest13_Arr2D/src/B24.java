import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n + 5][n + 5];
        int[] cnt = new int[105];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        TreeSet<Integer> set = new TreeSet<>();
        for (int j = 1; j <= n; j++) cnt[a[1][j]] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (cnt[a[i][j]] == i - 1) cnt[a[i][j]] = i;
            }
            if (i == n) {
                for (int j = 1; j <= n; j++) {
                    if (cnt[a[n][j]] == n) set.add(a[n][j]);
                }
            }
        }
        if (set.isEmpty()) System.out.println("NOT FOUND");
        else {
            for (int x : set) System.out.print(x + " ");
        }
    }
}
