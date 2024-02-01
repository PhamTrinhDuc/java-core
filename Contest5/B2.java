import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B2 {
    public static void func(long n) {
        long res = 0, cnt = -1, check = n;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                int tmp = 0;
                while (n % i == 0) {
                    n /= i;
                    tmp++;
                }
                if (tmp > cnt) {
                    cnt = tmp;
                    res = i;
                } else if (tmp == cnt && i < res) res = i;
            }
        }
        if (check == n) {
            res = n;
            cnt = 1;
        }
        System.out.println(res + " " + cnt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        func(n);
    }
}
