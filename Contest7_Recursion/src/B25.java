import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B25 {
    public static int Check(int[] a, int l, int r, int x) {
        if (l > r) return 0;
        int mid = (l + r) / 2;
        if (a[mid] == x) return 1;
        if (a[mid] > x) return Check(a, l, mid - 1, x);
        return Check(a, mid + 1, r, x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int x = sc.nextInt();
        Arrays.sort(a);
        if (Check(a, 0, n - 1, x) == 1)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
