import java.util.Scanner;
import java.io.*;
import java.util.*;

public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int x = sc.nextInt() ;
        int y = sc.nextInt() ;
        int z = sc.nextInt() ;
        int t = sc.nextInt() ;
        System.out.println(y + "," +  z + "," + x + "," + t );
        System.out.println((long)x+y+z+t) ;
        System.out.println(x-y+(long)z*t) ;
    }
}
