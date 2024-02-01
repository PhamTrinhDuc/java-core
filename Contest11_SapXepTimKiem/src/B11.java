import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Integer[] b = new Integer[n];
        Integer[] c = new Integer[m];
        for (int i = 0; i < n; i++) b[i] = sc.nextInt();
        for (int i = 0; i < m; i++) c[i] = sc.nextInt();
        Arrays.sort(b);
        Arrays.sort(c);
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (b[i] <= c[j]) {
                System.out.print("b" + (i + 1) + " ");
                i++;
            } else {
                System.out.print("c" + (j + 1) + " ");
                j++;
            }
        }
        while (i < n) {
            System.out.print("b" + (i + 1) + " ");
            i++;
        }
        while (j < m) {
            System.out.print("c" + (j + 1) + " ");
            j++;

        }

    }
}
