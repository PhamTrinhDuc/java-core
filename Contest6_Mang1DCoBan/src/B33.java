import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B33 {
    public static void DichPhai(int a[], int n) {
        int tmp = a[n - 1];
        for (int i = n - 1; i >= 1; i--) a[i] = a[i - 1];
        a[0] = tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int d = k % n;
        for (int i = 0; i < d; i++) DichPhai(a, n);
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
