import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

// day con tang lien tiep dai nhat

public class B48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tc = 0; tc < t; tc++) {
            int n = sc.nextInt();
            int[] a = new int[n + 1];
            // TH day con cuoi tang dan
            a[n] = a[n - 1] - 1;


            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            int max_len = -1, dem = 1;
            for (int i = 1; i <= n; i++) {
                if (a[i] > a[i - 1]) {
                    dem++;
                } else {
                    max_len = Math.max(max_len, dem);
                    dem = 1;
                }
            }
            System.out.printf("Test #%d :\n", tc + 1);
            System.out.println(max_len);
            int len = -1, cnt = 1;
            for (int i = 1; i <= n; i++) {
                if (a[i] > a[i - 1]) {
                    cnt++;
                } else {
                    len = Math.max(len, cnt);
                    cnt = 1;
                    if (len == max_len) {
                        for (int j = i - len; j < i; j++)
                            System.out.print(a[j] + " ");
                        System.out.println();
                    }
                    len = -1;
                }
            }
        }
    }
}
