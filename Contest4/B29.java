import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B29 {
    public static boolean Check1(int n) {
        while (n != 0) {
            if (n % 10 == 6) return true;
            n /= 10;
        }
        return false;
    }

    public static boolean Check2(int n) {
        int rev = 0;
        int m = n;
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev == m && sum % 10 == 8 ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=a ; i<=b ; i++ ){
            if(Check1(i) && Check2(i))
                System.out.print(i + " ");
        }
    }
}
