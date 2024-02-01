import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B17 {
    public static void PrintLeftToRight(long n) {
        if (n < 10) {
            System.out.print(n + " ");
            return;
        }
        PrintLeftToRight(n / 10);
        System.out.print(n % 10 + " ");
    }

    public static void PrintRightToLeft(long n) {
        if (n < 10) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n % 10 + " ");
        PrintRightToLeft(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        PrintLeftToRight(n);
        System.out.println();
        PrintRightToLeft(n);
    }
}
