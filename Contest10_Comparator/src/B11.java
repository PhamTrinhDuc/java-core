import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B11 {
    public static int Binary_Search(int[] a, int n, int x) {
        int l = 0, r = n - 1;
        int res = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] == x) {
                res = mid;
                r = mid - 1;
            } else if (a[mid] > x) r = mid - 1;
            else l = mid + 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int res = Binary_Search(a, n, x);
        System.out.println(res);
    }
}
