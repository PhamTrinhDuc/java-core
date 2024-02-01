import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B40 {
    public static int[] cnt = new int[15];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) a[i] *= -1;
            if (a[i] == 0) cnt[0]++;
            while (a[i] != 0) {
                cnt[a[i] % 10]++;
                a[i] /= 10;
            }
        }
        for (int i = 0; i <= 9; i++) {
            if (cnt[i] != 0) {
                System.out.println(i + " " + cnt[i]);
                cnt[i] = 0;
            }
        }
    }
}
