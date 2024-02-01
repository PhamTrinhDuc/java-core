import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

//Next greater element

public class B42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int ok = 0;
            for (int j = i + 1; j < n; j++) {
                if (a[j] > a[i]) {
                    System.out.print(a[j] + " ");
                    ok = 1;
                    break;
                }
            }
            if (ok == 0)
                System.out.print(-1 + "");
        }
        System.out.println(-1);
    }
}
