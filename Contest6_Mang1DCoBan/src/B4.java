import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (a[i] < x) cnt1++;
            else if (a[i] > x) cnt2++;
        }
        System.out.println(cnt1 + "\n" + cnt2);
    }
}
