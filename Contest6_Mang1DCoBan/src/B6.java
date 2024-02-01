import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0, cnt = 0;
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j < n; j++) {
                if (a[i] + a[j] == k) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
