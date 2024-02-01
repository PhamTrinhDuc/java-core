import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        long sum = a[0];
        Arrays.sort(a, 1, n, Collections.reverseOrder());
        for (int i = 1; i < n; i++) {
            if (i <= k) sum += a[i];
            else sum -= a[i];
        }
        System.out.println(sum);
    }
}
