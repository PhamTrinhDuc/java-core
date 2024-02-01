import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B2 {
    public static boolean Check(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return n > 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (Check(x)) {
                cnt++;
                sum += x;
            }
        }
        System.out.printf("%.3f", sum / cnt);
    }


}
