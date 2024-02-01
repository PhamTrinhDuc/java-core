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
        int cnt1 = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(cnt1++ + " ");
            }
            System.out.println();
        }
        System.out.println();

        // hinh 2
        for (int i = 1; i <= n; i++) {
            int cnt2 = i;
            for (int j = 1; j <= n; j++) {
                System.out.print(cnt2++ + " ");
            }
            System.out.println();
        }
        System.out.println();

        // hinh 3
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j < n - i + 1)
                    System.out.print("~");
                else
                    System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();

        // hinh 4
        for (int i = 1; i <= n; i++) {
            int tmp = n - 1, cnt = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(cnt + " ");
                cnt += tmp;
                tmp--;
            }
            System.out.println();
        }
        System.out.println();
    }
}
