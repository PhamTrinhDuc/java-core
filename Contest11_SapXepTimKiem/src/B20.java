import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        Arrays.sort(a);
        int res = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] - a[i - 1] > 1) {
                res += a[i] - a[i - 1] - 1;
            }
        }
        System.out.println(res);
    }
}
