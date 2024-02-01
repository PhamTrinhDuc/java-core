import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B4 {
    public static int Sum(int n) {
        if (n == 1) return -1;
        else if (n % 2 == 0) return n + Sum(n - 1);
        else return -1 * n + Sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Sum(n));
    }
}
