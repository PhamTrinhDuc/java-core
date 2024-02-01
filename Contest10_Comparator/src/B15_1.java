import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B15_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        Arrays.sort(a);
        int min_value = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            min_value = Math.min(min_value, Math.abs(a[i] - a[i - 1]));
        }
        int cnt = 0;
        for (int i = 1; i < n; i++) {
            if (min_value == Math.abs(a[i] - a[i - 1])) {
                cnt++;
            }
        }
        System.out.println(min_value + " " + cnt);
    }
}
