import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int l = sc.nextInt(), r = sc.nextInt();
//        Arrays.sort(a, l, r + 1);
        for (int i = l; i <= r; i++) System.out.print(a[i] + " ");
        System.out.println();
        for (int i = r; i >= l; i--) System.out.print(a[i] + " ");

    }
}
