import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.io.*;
import java.util.*;

public class B22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long S = sc.nextLong();
        if (S % n == 0) System.out.println(S / n);
        else System.out.println(S / n + 1);
    }
}
