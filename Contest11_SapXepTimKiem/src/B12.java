import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Integer[] a = new Integer[n];
        Integer[] b = new Integer[m];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < m; i++) b[i] = sc.nextInt();
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0, j = 0, cnt = 0;
        while (i < n && j < m) {
            if (a[i] > b[j]) {
                cnt++;
                i++;
                j++;
            } else i++;
        }
        System.out.println(cnt);
    }
}
