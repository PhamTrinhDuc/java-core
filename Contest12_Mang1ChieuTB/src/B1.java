import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B1 {
    public static boolean NT(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return n > 1;
    }

    public static boolean CheckTN(int[] a, int n) {
        int l = 0, r = n - 1;
        while (l <= r) {
            if (a[l] != a[r]) return false;
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mod = (int) 1e9 + 7;
        int[] a = new int[n];
        long max_val = Integer.MIN_VALUE, max_idx = -1;
        long min_val = Integer.MAX_VALUE, min_idx = -1;
        int cnt = 0;
        long res = -1, tich = 1;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] > max_val) {
                max_val = a[i];
                max_idx = i;
            }
            if (a[i] <= min_val) {
                min_val = a[i];
                min_idx = i;
            }
            if (NT(a[i])) cnt++;
            if (i >= 1)
                res = Math.max((long) a[i] * a[i - 1], res);
            tich = ((tich % mod) * a[i] % mod) % mod;
        }
        System.out.println(max_val + " " + max_idx);
        System.out.println(min_val + " " + min_idx);
        System.out.println(cnt);
        System.out.println(res);
        if (CheckTN(a, n)) System.out.println("YES");
        else System.out.println("NO");
        System.out.println(tich);
    }
}
