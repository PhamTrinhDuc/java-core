import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B30 {
    public static boolean Check2(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return n > 1;
    }

    public static boolean Check1(int n) {
        int tmp = n % 10;
        while (n != 0) {
            if (tmp < n % 10) return false;
            n /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (Check1(i) && Check2(i)) {
                System.out.print(i + " ");
                cnt++;
            }
        }
        System.out.println("\n" + cnt);
    }
}
