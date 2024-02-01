import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B10 {
    public static double Sum(int n) {
        if (n == 1) return 1;
        return 1.0 / n + Sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("%.3f", Sum(n));
    }
}
