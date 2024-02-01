import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B16 {
    public static boolean CheckNT(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return n > 1;
    }

    public static boolean CheckTN(int n) {
        int rev = 0, m = n;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev == m;
    }

    public static boolean CheckCP(int n) {
        int k1 = (int) (Math.sqrt(n));
        if (k1 * k1 == n) return true;
        return false;
    }

    public static boolean TongNT(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return CheckNT(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0 ; i<n ; i++ ) a[i] = sc.nextInt();
        int cnt1 = 0, cnt2 = 0, cnt3 = 0, cnt4 = 0;
        for (int i = 0; i < n; i++) {
            if (CheckNT(a[i])) cnt1++;
            if (CheckTN(a[i])) cnt2++;
            if (CheckCP(a[i])) cnt3++;
            if (TongNT(a[i])) cnt4++;
        }
        System.out.println(cnt1 + "\n" + cnt2 + "\n" + cnt3 + "\n" + cnt4);

    }
}
