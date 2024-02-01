import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class B39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];

        for (int i = 1; i <= n; i++) a[i] = sc.nextInt();

        int i = 1;
        while (i <= n) {
            int cnt = 0;
            while (i <= n && a[i] == 1) {
                cnt++;
                i++;
            }
            if (cnt != 0) {
                System.out.print(cnt + " ");
            }
            i++;
        }

        System.out.println();

        i = 1;
        while (i <= n) {
            int cnt = 0;
            while (i <= n && a[i] == 0) {
                cnt++;
                i++;
            }
            if (cnt != 0) {
                System.out.print(cnt + " ");
            }
            i++;
        }
    }
}