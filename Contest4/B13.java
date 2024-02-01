import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int p = sc.nextInt();
        long cnt = 0;
        for (long i = p; i <= n; i *= p) {
            cnt += n / i;
        }
        System.out.println(cnt);
    }
}
