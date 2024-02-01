import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B14 {
    public static boolean nt(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return n > 1;
    }

    public static int tong(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static boolean CheckFibo(int n) {
        if (n == 0) return true;
        if (n == 1) return true;
        int f0 = 0, f1 = 1;
        for (int i = 2; i <= 92; i++) {
            int fn = f0 + f1;
            if (fn == n) return true;
            f0 = f1;
            f1 = fn;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i < n; i++) {
            if (nt(i) && CheckFibo(tong(i))) System.out.print(i + " ");
        }
    }
}
