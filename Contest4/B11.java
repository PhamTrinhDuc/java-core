import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B11 {
    public static int func(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return i;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(func(i));
        }
    }
}
