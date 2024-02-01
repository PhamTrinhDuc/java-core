import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B18 {
    public static boolean CheckNt(long n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return n > 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int cnt = 0;
        while (n != 0) {
            if (CheckNt(n % 10)) cnt++;
            n /= 10;
        }
        System.out.println(cnt);
    }
}
