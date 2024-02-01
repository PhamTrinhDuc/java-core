import java.util.Scanner;
import java.lang.Math;
import java.io.*;
import java.util.*;
public class B6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        double n = sc.nextDouble() ;
        System.out.println((int)Math.floor(n));
        System.out.println((int)Math.ceil(n));
        System.out.println((int)Math.round(n));
    }
}
