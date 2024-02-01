import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B27 {
    public static boolean CheckTN(int n) {
        int rev = 0;
        int m = n;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev == m;
    }

    public static boolean CheckUocNt(int n) {
        int cnt = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    n /= i;
                }
                cnt++;
            }

        }
        if (n != 1) cnt++;
        return cnt >= 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ok = 0;
        for (int i = a; i <= b; i++) {
            if (CheckTN(i) && CheckUocNt(i)) {
                ok = 1;
                System.out.print(i + " ");
            }
        }
        if (ok == 0) System.out.println(-1);
    }
}
