import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B32 {
    public static void DichTrai(int a[], int n) {
        int tmp = a[0];
        for (int i = 0; i < n-1; i++) a[i] = a[i + 1];
        a[n - 1] = tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int d = k % n;
        for (int i = 0; i < d; i++) DichTrai(a, n);
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
