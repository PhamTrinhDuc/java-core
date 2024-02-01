import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] F = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        F[0] = a[0];
        for (int i = 1; i < n; i++) F[i] = F[i - 1] + a[i];
        for (int i = 0; i < n; i++) System.out.print(F[i] + " ");
    }
}
