import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B16 {
    public static int SumDigit(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static boolean CheckSmith(long n) {
        int sum1 = SumDigit(n);
        int sum2 = 0;
        long tmp = n;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    sum2 += SumDigit(i);
                    n /= i;
                }
            }
        }
        if (n == tmp) return false;
        if (n != 1) sum2 += SumDigit(n);
        return sum1 == sum2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (CheckSmith(n)) System.out.println("YES");
        else System.out.println("NO");
    }
}
