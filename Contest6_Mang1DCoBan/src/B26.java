import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] cnt = new int[1000006];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            cnt[a[i]]++;
        }
        int res = 0;
        for (int x : a) {
            if (cnt[x] != 0) {
                res++;
                cnt[x] = 0;
            }
        }
        System.out.println(res);
    }
}
