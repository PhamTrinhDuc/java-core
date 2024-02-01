import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.io.*;
import java.util.*;

public class B33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        if ((a + b + c + n) % 3 == 0 ){
            int x = (a + b + c + n ) / 3 ;
            if(x >= a && x >= b && x >= c )
                System.out.println("YES");
            else System.out.println("NO");
        }
        else System.out.println("NO");
    }
}
