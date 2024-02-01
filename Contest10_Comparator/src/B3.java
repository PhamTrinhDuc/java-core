import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B3 {
    public static int BS1(int[] a, int n, int k) {
        int l = 0, r = n - 1;
        int res = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] >= k) {
                res = mid;
                r = mid - 1;
            } else l = mid + 1;
        }
        return res;
    }

    public static int BS2(int[] a, int n, int k) {
        int l = 0, r = n - 1;
        int res = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] > k) {
                res = mid;
                r = mid - 1;
            } else l = mid + 1;
        }
        return res;
    }

    public static int BS3(int[] a, int n, int k) {
        int l = 0, r = n - 1;
        int res = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] == k) {
                res = mid;
                r = mid - 1;
            } else if (a[mid] > k) {
                r = mid - 1;
            } else l = mid + 1;
        }
        return res;
    }

    public static int BS4(int[] a, int n, int k) {
        int l = 0, r = n - 1;
        int res = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] == k) {
                res = mid;
                l = mid + 1;
            } else if (a[mid] > k) {
                r = mid - 1;
            } else l = mid + 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        System.out.println(BS1(a, n, k));
        System.out.println(BS2(a, n, k));
        System.out.println(BS3(a, n, k));
        System.out.println(BS4(a, n, k));
        int l = BS3(a, n, k), r = BS4(a, n, k);
        if (l != -1)
            System.out.println(r - l + 1);
        else
            System.out.println(0);
    }
}
