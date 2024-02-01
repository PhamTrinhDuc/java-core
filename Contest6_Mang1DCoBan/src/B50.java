import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

// so cap chan

public class B50 {
    public static int[] cnt = new int[10];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            cnt[a[i] % 2]++;
        }
        long CapChan = (long)cnt[0] * (cnt[0] - 1) / 2;
        long CapLe = (long)cnt[1] * (cnt[1] - 1) / 2;
        System.out.println(CapLe + CapChan);
    }
}
