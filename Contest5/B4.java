import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B4 {
    public static int GCD(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static int LCM(int a, int b) {
        return (a / GCD(a, b)) * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int GCD_ab = GCD(a, b), LCM_ab = LCM(a, b);
        int GCD_abc = GCD(GCD_ab, c), LCM_abc = LCM(LCM_ab, c);
        int GCD_abcd = GCD(GCD_abc, d), LCM_abcd = LCM(LCM_abc, d);
        System.out.println(GCD_abcd + " " + LCM_abcd);
    }
}
