import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B9 {
    public static long ltnp(long n, long m, long k) {
        long res = 1;
        long tmp = (long) Math.pow(10, k);
        while (m != 0) {
            if (m % 2 == 1) {
                res = ((res % tmp) * (n % tmp)) % tmp;
            }
            n = ((n % tmp) * (n % tmp)) % tmp;
            m /= 2;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long k = sc.nextLong();
        System.out.println(ltnp(n, m, k));
    }
}
