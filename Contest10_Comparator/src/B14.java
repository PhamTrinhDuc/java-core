import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B14 {
    public static int Binary_Search(int[] a, int n, int k) {
        int l = 0, r = n - 1;
        int res = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] < k) {
                res = mid;
                l = mid + 1;
            } else r = mid - 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < m; i++) b[i] = sc.nextInt();
        Arrays.sort(b);

        for (int i = 0; i < n; i++) {
            int res = Binary_Search(b, m, a[i]);
            System.out.print(res + 1 + " ");
        }
    }
}
