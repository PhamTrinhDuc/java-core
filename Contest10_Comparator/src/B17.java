import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B17 {
    public static int FindLeft(int[] a, int n, int x) {
        // phan tu dau tien >= x
        int l = 0, r = n - 1;
        int res = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] >= x) {
                res = mid;
                r = mid - 1;
            } else l = mid + 1;
        }
        return res;
    }

    public static int FindRight(int[] a, int n, int x) {
        // phan tu cuoi cung <= x
        int l = 0, r = n - 1;
        int res = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] <= x) {
                res = mid;
                l = mid + 1;
            } else r = mid - 1;
        }
        return res;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int q = sc.nextInt();
        while (q-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int left = FindLeft(arr, n, l);
            int right = FindRight(arr, n, r);
            if (left != -1)
                System.out.println(right - left + 1);
            else
                System.out.println(0);
        }
    }
}
