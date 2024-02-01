import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int mod = (int) 1e9 + 7;
        long tong = 0, tich = 1;
        for (int i = 0; i < n; i++) {
            tich = (tich * a[i] % mod) % mod;
            tong = (tong + a[i] % mod) % mod;
        }
        System.out.println(tong);
        System.out.println(tich);
    }
}
