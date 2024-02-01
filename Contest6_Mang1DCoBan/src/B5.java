import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int ok = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0 && i % 2 == 0) {
                System.out.print(a[i] + " ");
                ok = 1;
            }
        }
        if (ok == 0) System.out.println("NONE");
    }
}
