import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long h = n / (60 * 60);
        long p = (n % 3600) / 60;
        long s = n % 60;
        System.out.printf("%dh : %dm : %ds", h, p, s);
    }
}
