import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B5 {
    public static int Gt(int n) {
        if (n == 0) return 1;
        else return n * Gt(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Gt(n));
    }
}
