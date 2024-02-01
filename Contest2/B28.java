import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.io.*;
import java.util.*;

public class B28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int u1 = sc.nextInt();
        int d = sc.nextInt();
        long un = u1 + (long) (n - 1) * d;
        System.out.println((u1 + un) * n / 2);
    }
}
