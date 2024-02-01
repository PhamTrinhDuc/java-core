import javax.print.CancelablePrintJob;
import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B11 {
    public static boolean CheckFibo(long n) {
        if (n == 0 || n == 1) return true;
        long f0 = 0, f1 = 1;
        for (int i = 2; i <= 92; i++) {
            long fn = f0 + f1;
            if (fn == n) return true;
            f0 = f1;
            f1 = fn;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextLong();
        int ok = 0;
        for (long x : a) {
            if (CheckFibo(x)) {
                System.out.print(x + " ");
                ok = 1;
            }
        }
        if (ok == 0) System.out.println("NONE");
    }
}
