import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / (2 * i);
        }
        System.out.printf("%.5f", sum);
    }
}
