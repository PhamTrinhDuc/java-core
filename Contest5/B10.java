import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B10 {
    public static long func(int n) {
        int mod = (int) 1e9 + 7;
        if (n == 1 || n == 2) return 1;
        long f1 = 1, f2 = 1, fn;
        for (int i = 3; i <= 1e6; i++) {
            fn = ((2 * f1 % mod) + (3 * f2 % mod)) % mod;
            if (i == n) return fn;
            f2 = f1;
            f1 = fn;
        }
        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(func(n));
    }

}
