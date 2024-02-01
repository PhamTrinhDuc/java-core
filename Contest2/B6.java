
import java.util.Scanner;
import java.lang.Math;
import java.io.*;
import java.util.*;

public class B6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 1.....
        if (n % 2 == 0) System.out.println("YES");
        else System.out.println("NO");
        // 2.....
        if (n % 3 == 0 && n % 5 == 0) System.out.println("YES");
        else System.out.println("NO");
        // 3.....
        if (n % 3 == 0 && n % 7 != 0) System.out.println("YES");
        else System.out.println("NO");
        // 4.....
        if (n % 3 == 0 || n % 7 == 0) System.out.println("YES");
        else System.out.println("NO");
        // 5.....
        if (n > 30 && n < 50) System.out.println("YES");
        else System.out.println("NO");
        // 6.....
        if (n >= 30 && (n % 2 == 0 || n % 3 == 0 || n % 5 == 0))
            System.out.println("YES");
        else
            System.out.println("NO");
        // 7.....
        if ((n >= 10 && n <= 99) && (n % 10 == 2 || n % 10 == 3 || n % 10 == 5 || n % 10 == 7))
            System.out.println("YES");
        else
            System.out.println("NO");
        // 8.....
        if (n <= 100 && n % 23 == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
        // 9.....
        if (n < 10 || n > 20)
            System.out.println("YES");
        else
            System.out.println("NO");
        // 10.....
        if (n % 10 % 3 == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
