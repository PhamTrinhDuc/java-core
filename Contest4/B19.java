import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B19 {
    public static boolean func(int n) {
        int cnt = 0;
        int res = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                int tmp = 0;
                while (n % i == 0) {
                    tmp++;
                    n /= i;
                }
                if (tmp < 2) return false;
            }
        }
        if (n != 1) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            if (func(i))
                System.out.print(i + " ");
        }
    }
}
//4 8 9 16 25 27 32 36 49