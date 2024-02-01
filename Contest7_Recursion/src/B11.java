import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B11 {
    public static void transform(long n) {
        if (n == 0) return;
        transform(n / 2);
        System.out.print(n % 2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n==0) System.out.println(0);
        transform(n);

    }
}
