import java.util.Scanner;
import java.lang.Math;
import java.io.*;
import java.util.*;
public class B18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int a = sc.nextInt() ;
        int b = sc.nextInt() ;
        int tmp =a  ; a = b ; b = tmp ;
        System.out.println((long)128*a + (long)97*b + 1000);
    }
}
