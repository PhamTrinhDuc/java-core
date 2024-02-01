import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B43 {
    static long Mod(String s, long x) {
        long sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum = sum * 10 + s.charAt(i) - '0';
            sum %= x;
        }
        return sum;
    }

    static String GCD(String s, long m) {
        if (m == 0) return s;
        return GCD("" + m, Mod(s, m));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        long m = sc.nextLong();
        System.out.println(GCD(n, m));
    }
}
