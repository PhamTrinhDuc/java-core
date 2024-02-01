import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B12 {
    public static void PTNT(long n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                int cnt = 0;
                while (n % i == 0) {
                    n /= i;
                    cnt++;
                }
                System.out.print(i + "^" + cnt + " ");
                if (n != 1) System.out.print("* ");
            }
        }
        if (n != 1) System.out.print(n + "^" + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        PTNT(n);

    }
}
