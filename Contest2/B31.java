import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.io.*;
import java.util.*;

public class B31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tong_cup = 0, tong_hc = 0;
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int b3 = sc.nextInt();
        int n = sc.nextInt();
        tong_cup += a1 + a2 + a3 ; tong_hc += b1 + b2 + b3 ;
        int res = 0;
        if (tong_cup % 5 == 0) res += tong_cup / 5;
        else res += tong_cup / 5 + 1;

        if (tong_hc % 10 == 0) res += tong_hc / 10;
        else res += tong_hc / 10 + 1;

        if (res <= n) System.out.println("YES");
        else System.out.println("NO");
    }
}
