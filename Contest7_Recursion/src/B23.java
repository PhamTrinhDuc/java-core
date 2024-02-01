import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B23 {
    public static boolean Check(int[] a, int l, int r) {
        if (l >= r) return true;
        if (a[l] % 2 == 1) return false;
        return Check(a, l + 1, r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        if (Check(a, 0, n - 1))
            System.out.println("YES");
        else System.out.println("NO");
    }
}
