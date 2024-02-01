import java.util.Scanner;
import java.lang.Math;
import java.io.*;
import java.util.*;
public class B16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int x = sc.nextInt() ;
        int y = sc.nextInt() ;
        int z = sc.nextInt() ;
        int t = sc.nextInt() ;
        System.out.println(x+"  "+y+"  "+z+"  "+t +"\n") ;
        System.out.println(y+"--"+z+"--"+x+"--"+t +"\n") ;
        System.out.println(x*2+","+3*y+","+4*z+","+5*t +'\n');
        System.out.println("KET THUC !!");
    }
}
