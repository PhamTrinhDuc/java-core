import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B17 {
    public static int UocNTMax(int n) {
        int res = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                res = Math.max(res, i);
                n/=i ;
            }
        }
        if (n != 1) res = Math.max(res, n);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(UocNTMax(n));
        }
    }
}
