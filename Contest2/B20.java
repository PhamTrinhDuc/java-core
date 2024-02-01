import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.io.*;
import java.util.*;

public class B20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long a = sc.nextLong();

        if (n % a == 0 && m % a == 0)
            System.out.println((n * m) / (a * a));
        else if (n % a == 0 && m % a != 0)
            System.out.println((n / a) * (m / a) + n / a);
        else if (n % a != 0 && m % a == 0)
            System.out.println((n / a) * (m / a) + m / a);
        else
            System.out.println((n / a) * (m / a) + n / a + m / a + 1);
    }
}
