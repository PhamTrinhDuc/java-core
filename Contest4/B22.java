import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        long a = sc.nextLong() ;
        long b = sc.nextLong() ;
        int left = (int)Math.sqrt(a) ;
        if((long)left*left != a ) left++ ;
        int right = (int)Math.sqrt(b) ;
        System.out.println(right - left + 1 );
    }
}
