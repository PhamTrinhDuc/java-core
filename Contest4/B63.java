import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B63 {
    public static long Fibo1(int n) {
        if (n == 1) System.out.println(0);
        if (n == 2) System.out.println(1);
        long f0 = 0, f1 = 1, fn = -1;
        int mod = 1000000007;
        for (int i = 3; i <= n; i++) {
            fn = (f0 % mod + f1 % mod) % mod;
            f0 = f1;
            f1 = fn;
        }
        return fn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Fibo1(n));
    }
}
