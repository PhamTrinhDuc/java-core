import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B14 {
    public static int CountDigit(long n) {
        if (n < 10) return 1;
        return 1 + CountDigit(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(CountDigit(n));
    }
}
