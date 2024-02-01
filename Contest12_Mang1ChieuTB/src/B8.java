import java.io.*;
import java.time.Year;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Vector<Integer> v = new Vector<>();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < m; i++) b[i] = sc.nextInt();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                v.add(a[i]);
                i++;
            } else {
                v.add(b[j]);
                j++;
            }
        }
        while (i < n) {
            v.add(a[i]);
            i++;
        }
        while (j < m) {
            v.add(b[j]);
            j++;
        }
        for (int x : v) System.out.print(x + " ");
    }
}
