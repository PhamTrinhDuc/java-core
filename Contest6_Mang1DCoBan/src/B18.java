import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        if ((long) a[0] * a[1] < 0) System.out.print(a[0] + " ");

        for (int i = 1; i <= n - 2; i++) {
            if ((long) a[i] * a[i - 1] < 0 || (long) a[i] * a[i + 1] < 0) {
                System.out.print(a[i] + " ");
            }
        }
        if ((long) a[n - 1] * a[n - 2] < 0) System.out.print(a[n - 1]);
    }
}
