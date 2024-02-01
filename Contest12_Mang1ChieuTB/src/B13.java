import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long cnt = 0;
        int[] a = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        for (int i = 0; i < a.length; i++) {
            while (n >= a[i]) {
                cnt += n / a[i];
                n %= a[i];
//                System.out.println(n);
            }
        }
        System.out.println(cnt);
    }
}
