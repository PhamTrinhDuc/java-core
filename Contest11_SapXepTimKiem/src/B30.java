import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        double max_val = Math.max(a[0], l - a[n - 1]);
        for (int i = 1; i < n; i++) {
            max_val = Math.max(max_val, (a[i] - a[i - 1]) * 1.0 / 2);
        }
        System.out.printf("%.10f", max_val);
    }
}
