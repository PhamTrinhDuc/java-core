import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B16 {
    public static long FindDigitMin(long n) {
        if (n < 10) return n;
        return Math.min(n % 10, FindDigitMin(n / 10));
    }

    public static long FindDigitMax(long n) {
        if (n < 10) return n;
        return Math.max(n % 10, FindDigitMax(n / 10));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.print(FindDigitMax(n) + " " + FindDigitMin(n));
    }
}
