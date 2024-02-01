import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B27 {
    public static int[] cnt = new int[1000006];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            cnt[a[i]]++;
        }
        for (int i = 0; i <= 1000005; i++) {
            if (cnt[i] != 0) {
                System.out.println(i + " " + cnt[i]);
                cnt[i] = 0;
            }
        }
    }
}
