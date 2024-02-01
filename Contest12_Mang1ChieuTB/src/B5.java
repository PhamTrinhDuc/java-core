import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        Arrays.sort(a);
        System.out.println((a[1] - a[0]) + " " + (a[n - 1] - a[0]));
        for (int i = 1; i < n - 1; i++) {
            int min_val = Math.min((a[i] - a[i - 1]), (a[i + 1] - a[i]));
            int max_val = Math.max((a[i] - a[0]), (a[n - 1] - a[i]));
            System.out.println(min_val + " " + max_val);
        }
        System.out.println((a[n - 1] - a[n - 2]) + " " + (a[n - 1] - a[0]));
    }
}
