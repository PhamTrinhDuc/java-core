import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int Max = Integer.MIN_VALUE, Min = Integer.MAX_VALUE;
        int IdxMin = -1, IdxMax = -1;

        for (int i = 0; i < n; i++) {
            if (a[i] > Max) {
                Max = a[i];
                IdxMax = i;

            }
            if (a[i] <= Min) {
                Min = a[i];
                IdxMin = i;
            }
        }
        System.out.println(IdxMin + " " + IdxMax);
    }
}