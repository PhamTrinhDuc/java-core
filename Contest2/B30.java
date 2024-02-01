import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.io.*;
import java.util.*;

public class B30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // n/k * n-1/k-1 * ... * n-k+1 / 1
        System.out.println((long)n*(n-1) / 2);
    }
}
