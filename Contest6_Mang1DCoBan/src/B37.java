import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B37 {
    public static int[] cnt = new int[10000006];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            cnt[a[i]]++;
        }
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            if (cnt[x] != 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
