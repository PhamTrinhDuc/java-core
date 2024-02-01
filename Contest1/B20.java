import java.util.Scanner;
import java.lang.Math;
import java.io.*;
import java.util.*;
public class B20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String s = sc.nextLine() ;
        String tmp = s;
        while (s.length() < 6 ) {
            s = "0" + s ;
        }
        System.out.println(s);
        while(tmp.length() < 6 ) {
            tmp = "#" + tmp ;
        }
        System.out.println(tmp) ;
    }
}
