import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B3 {
    public static long SumRecurse(int n) {
        if (n == 1) return 1;
        else
            return (long) n * n * n + SumRecurse(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(SumRecurse(n));
    }
}
