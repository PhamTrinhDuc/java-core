import java.util.Scanner;
import java.lang.Math;
import java.io.*;
import java.util.*;

public class B13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int x = sc.nextInt() ;
        int y = sc.nextInt() ;
        int z = sc.nextInt() ;
        int t = sc.nextInt() ;
        System.out.println(Math.max(x , y));
        System.out.println(Math.min(z , t));
        // ham max cua java chi chua 2 bien so
        System.out.println(Math.max(Math.max(x ,y) , z));
        System.out.println(Math.min(Math.min(Math.min(x , y) , z) , t));
    }
}
