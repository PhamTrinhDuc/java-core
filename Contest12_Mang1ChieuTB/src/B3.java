import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int tmp = a[0];
        System.out.print(a[0] + " ");
        for (int i = 1; i < n; i++) {
            if (a[i] > tmp) {
                tmp = a[i];
                System.out.print(a[i] + " ");
            }
        }
    }
}
