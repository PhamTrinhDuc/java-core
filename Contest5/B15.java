import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B15 {
    public static boolean Check(long n) {
        if (n == 0) return true;
        if (n == 1) return true;
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
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            if (Check(n)) System.out.print("YES\n");
            else System.out.print("NO\n");

        }
    }
}
