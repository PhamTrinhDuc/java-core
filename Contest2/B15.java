import java.util.Scanner;
import java.lang.Math;
import java.io.*;
import java.util.*;
//a : 1 lit
//b : 2 lit
//-> n lit voi so tien it nhat
public class B15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < b )
            System.out.println(n*a);
        else{
            if (n % 2 != 0 )
                System.out.println(b*(n/2) + a );
            else
                System.out.println(b*(n/2));
        }
    }
}
