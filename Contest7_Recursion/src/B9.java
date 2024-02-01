import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B9 {
    public static int mod = (int) 1e9 + 7;

    public static long LTNP(int a, int b) {
        if (b == 0) return 1;
        long x = LTNP(a, b / 2);
        if (b % 2 == 0) return (x * x % mod) % mod;
        return ((x * x % mod) * a) % mod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(LTNP(a, b));
    }
}
