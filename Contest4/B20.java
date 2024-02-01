import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B20 {
    public static boolean CheckCP(long n) {
        long k = (long) Math.sqrt(n);
        if (k * k == n) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (CheckCP(n)) System.out.println("YES");
        else System.out.println("NO");
    }
}
