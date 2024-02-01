import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B22 {
    public static void PrintLeftToRight(int[] a, int l, int r) {
        if (l >= r) {
            System.out.print(a[l] + " ");
            return;
        }
        System.out.print(a[l] + " ");
        PrintLeftToRight(a, l + 1, r);
    }

    public static void PrintRightToLeft(int[] a, int l, int r) {
        if (l >= r) {
            System.out.print(a[l] + " ");
            return;
        }
        PrintRightToLeft(a, l + 1, r);
        System.out.print(a[l] + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        PrintLeftToRight(a, 0, n - 1);
        System.out.println();
        PrintRightToLeft(a, 0, n - 1);
    }
}
