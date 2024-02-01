import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B26 {
    public static boolean CheckNT(long n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return n > 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int ok = 0;
        for (int p = 2; p <= 63; p++) {
            if (CheckNT(p) && CheckNT((long) Math.pow(2, p) - 1)) {
                if ((long) (Math.pow(2, p - 1) * (Math.pow(2, p) - 1)) == n) {
                    System.out.println("YES");
                    ok = 1;
                    break;
                }
            }
        }
        if (ok == 0) System.out.println("NO");
    }
}
