import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B6 {
    public static boolean CheckNT(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return n > 1;
    }

    public static boolean Check(int n) {
        int sum = 0;
        while (n != 0) {
            int tmp = n % 10;
            if (tmp != 2 && tmp != 3 && tmp != 5 && tmp != 7) return false;
            sum += tmp;
            n /= 10;
        }
        return CheckNT(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (Check(i) && CheckNT(i))
                cnt++;
        }
        System.out.println(cnt);
    }
}
