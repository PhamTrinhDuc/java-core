import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B28 {
    public static int Check(long n) {
        while (n != 0) {
            if (n % 10 != 0 && n % 10 != 6 && n % 10 != 8) return 0;
            n /= 10;
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(Check(n));
    }
}
