import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < m; i++) b[i] = sc.nextInt();
        for (int i = 0; i < p; i++) System.out.print(a[i] + " ");
        for (int i = 0; i < m; i++) System.out.print(b[i] + " ");
        for (int i = p; i < n; i++) System.out.print(a[i] + " ");
    }
}
