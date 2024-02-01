import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B28 {
    static long fatorial(int n) {
        long res = 1;
        for (int i = 1; i <= n; i++) res *= i;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += fatorial(i);
        }
        System.out.println(sum);
    }
}
