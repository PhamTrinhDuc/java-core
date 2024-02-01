import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long cnt = 0;
        int mod = 1000000007;
        for (long p = 5; p <= n; p *= 5) {
            cnt += n / p;
            cnt %= mod;
        }
        System.out.println(cnt);
    }
}
