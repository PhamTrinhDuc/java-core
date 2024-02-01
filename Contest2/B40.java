import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.io.*;
import java.util.*;

public class B40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 1000)
            System.out.println(4500 * n + 1200000);
        else if (n >= 800)
            System.out.println(3900*n + 900000);
        else if(n >= 500)
            System.out.println(3700*n + 800000);
        else
            System.out.println(3300*n);
    }
}
