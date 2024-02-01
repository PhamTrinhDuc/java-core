import java.util.Scanner ;
import java.io.*;
import java.util.*;

public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int x  = sc.nextInt() ;
        long y = sc.nextLong() ;
        char c = sc.next().charAt(0) ;
        float f = sc.nextFloat() ;
        double d = sc.nextDouble() ;
        System.out.println(x) ;
        System.out.println(y);
        System.out.println(c);
        System.out.printf("%.2f\n" ,  f );
        System.out.printf("%.9f\n" , d );
    }
}
//614
//999999999999990528
//G
//19.088
//2.9648