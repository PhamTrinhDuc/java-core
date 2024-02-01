import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B17 {
    public static int FindLeft(int[] a, int l, int r, int x) {
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

    public static int FindRight(int[] a, int l, int r, int x) {
        int res = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] == x) {
                res = mid;
                l = mid + 1;
            } else if (a[mid] > x) r = mid - 1;
            else l = mid + 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        long cnt = 0;
        for (int i = 0; i < n; i++) {
            int l = FindLeft(arr, i + 1, n - 1, k - arr[i]);
            int r = FindRight(arr, i + 1, n - 1, k - arr[i]);
            if (l != -1)
                cnt += r - l + 1;
        }
        System.out.println(cnt);
    }
}
