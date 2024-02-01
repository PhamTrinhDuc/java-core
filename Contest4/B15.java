import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B15 {
    public static int CheckSphenic(long n) {
        int cnt = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                int tmp = 0;
                while (n % i == 0) {
                    tmp++;
                    n /= i;
                }
                if (tmp > 1) return 0;
                cnt++;
            }
        }
        if (n != 1) cnt++;
        if (cnt == 3) return 1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(CheckSphenic(n));
    }
}
