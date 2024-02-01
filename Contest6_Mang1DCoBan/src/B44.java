import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

//day con chan le

public class B44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int cnt1 = 0, cnt2 = 0;
            for (int j = i; j < n; j++) {
                if (a[j] % 2 == 0) cnt1++;
                else cnt2++;
                if (cnt1 == cnt2) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
