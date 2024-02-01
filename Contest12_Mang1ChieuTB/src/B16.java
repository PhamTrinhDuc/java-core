import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B16 {
    public static boolean check(Integer[] arr, int n) {
        for (int i = 0; i < n; i++) {
            long c = (long) arr[i] * arr[i];
            int l = i + 1, r = n - 1;
            while (l < r) {
                long a = (long) arr[l] * arr[l];
                long b = (long) arr[r] * arr[r];
                if (c == a + b) return true;
                l++;
                r--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        Arrays.sort(a, Collections.reverseOrder());
        if (check(a, n)) System.out.println("YES");
        else System.out.println("NO");
    }
}
