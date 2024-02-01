import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B13 {
    public static int Sum(long n) {
        if (n == 0) return 0;
        return (int) (n % 10 + Sum(n / 10));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(Sum(n));
    }
}
