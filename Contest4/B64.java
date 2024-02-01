import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B64 {
    public static boolean Check(long n) {
        long f0 = 0, f1 = 1;
        if (n == 0 || n == 1) return true;
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
        long n = sc.nextLong();
        if (Check(n))
            System.out.println("YES");
        else System.out.println("NO");
    }
}
