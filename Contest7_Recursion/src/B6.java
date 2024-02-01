import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B6 {
    public static int F[] = new int[92];
    public static int fibo(int n) {
        F[1] = 1; F[2] = 1;
        if(n==1) return 0;
        if(n==2) return 1;
        if(F[n-2] == 0)
            F[n-2] = fibo(n-2);
        if(F[n-1]==0)
            F[n-1] = fibo(n-1);
        return fibo(n-1) + fibo(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }
}
