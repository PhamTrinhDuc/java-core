import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int idx = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == k) {
                idx = i;
                break;
            }
        }
        if (idx == -1) System.out.println("NOT FOUND");
        else {
            for (int i = 0; i < n; i++) {
                if (idx != i) System.out.print(a[i] + " ");
            }
        }
    }
}
