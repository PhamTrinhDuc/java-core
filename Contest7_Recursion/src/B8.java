import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B8 {
    public static long GCD(long a, long b) {
        if (b == 0) return a;
        return GCD(b, a % b);
    }

    public static long LCM(long a, long b) {
        return a / GCD(a, b) * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(GCD(a, b) + " " + LCM(a, b));
    }
}
