import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.io.*;
import java.util.*;

public class B32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k2 =  sc.nextInt();
        int k3 = sc.nextInt() ;
        int k5 = sc.nextInt() ;
        int k6 = sc.nextInt() ;

        int min_256 = Math.min(Math.min(k2, k5), k6);
        int min_32 = Math.min(k2-min_256 , k3) ;
        System.out.println((long)min_256*256  + (long)min_32*32);

    }
}
