import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B2 {
    public static boolean check(int[] a, int n) {
        for (int i = 1; i < n; i++) {
            if (a[i] <= a[i - 1]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        if (check(a, n)) System.out.println("YES");
        else System.out.println("NO");
    }
}
