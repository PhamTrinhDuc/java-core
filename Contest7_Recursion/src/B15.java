import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B15 {
    public static long FindFirstNumber(long n) {
        if (n < 10) return n;
        return FindFirstNumber(n / 10);
    }

    public static void main(String[] ags) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(FindFirstNumber(n));
    }
}