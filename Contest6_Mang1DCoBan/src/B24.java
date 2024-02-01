import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < k; i++) sum += a[i];
        System.out.print(sum + " ");
        for (int i = k; i < n; i++) {
            sum += a[i] - a[i - k];
            System.out.print(sum + " ");
        }
    }
}
