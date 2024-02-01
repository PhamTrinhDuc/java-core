import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B9 {
    public static boolean CheckNT(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return n > 1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int cnt = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (CheckNT(i)) cnt++;
        }
        System.out.println(cnt);
    }
}
