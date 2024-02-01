import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int res = Integer.MAX_VALUE, cnt = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            res = Math.min(res, a[i]);
        }
        for (int i = 0; i < n; i++) {
            if (a[i] == res) cnt++;
        }
        System.out.println(cnt);
    }
}
