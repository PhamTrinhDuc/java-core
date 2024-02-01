import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B17 {
    public static boolean check(int a[], int n) {
        int l = 0, r = n - 1;
        while (l <= r) {
            if (a[l] != a[r]) return false;
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        if (check(a, n)) System.out.println("YES");
        else System.out.println("NO");
    }
}
