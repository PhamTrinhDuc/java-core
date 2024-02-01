import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.io.*;
import java.util.*;

public class B19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        if (m % 2 == 0)
            System.out.println(1L * m * n / 2);
        else {
            System.out.println((1L * m / 2) * n + n / 2);
        }
    }
}
