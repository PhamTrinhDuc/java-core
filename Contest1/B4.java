import java.util.Scanner;
import java.lang.Math;
import java.io.*;
import java.util.*;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int x = sc.nextInt();
        int y = sc.nextInt();
        long res = (long)Math.pow(x , y) ;
        System.out.println(res);
    }
}
