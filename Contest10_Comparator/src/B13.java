import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B13 {
    public static int Binary_Search(int[] a, int n, int x) {
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
        int[] a = new int[n];
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        if (Binary_Search(a, n, k) != -1)
            System.out.println(a[Binary_Search(a, n, k)]);
        else
            System.out.println("NOT FOUND");
    }
}
