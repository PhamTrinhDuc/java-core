import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B24 {
    public static boolean Check(int[] a, int r) {
        if (r <= 0) return true;
        if (a[r] <= a[r - 1]) return false;
        return Check(a, r - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        if (Check(a, n - 1))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
