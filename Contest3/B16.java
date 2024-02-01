import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n == 0)
            System.out.println(1);
        else {
            int cnt = 0;
            while (n != 0) {
                cnt++;
                n /= 10;
            }
            System.out.println(cnt);
        }
    }
}
