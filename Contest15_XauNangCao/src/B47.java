import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B47 {
    static long GCD(long x, long y) {
        if (y == 0) return x;
        return GCD(y, x % y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long x = sc.nextLong();
        long y = sc.nextLong();
        long tmp = GCD(x, y);
        for (int i = 1; i <= tmp; i++) System.out.print(a);
    }
}
