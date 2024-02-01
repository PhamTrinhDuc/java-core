import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B18 {
    public static int SumEven(long n) {
        if (n == 0) return 0;
        if (n % 2 == 0) return (int) (n % 10 + SumEven(n / 10));
        return SumEven(n / 10);
    }

    public static int SumOdd(long n) {
        if (n == 0) return 0;
        if (n % 2 == 1) return (int) (n % 10 + SumOdd(n / 10));
        return SumOdd(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(SumEven(n));
        System.out.println(SumOdd(n));
    }
}
