import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        int mod = (int) 1e9 + 7;
        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            sum = (sum%mod + x%mod ) % mod ;
        }
        System.out.println(sum);
    }
}
