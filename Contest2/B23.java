import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.io.*;
import java.util.*;

public class B23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ToiThieu = (n+1)/2 ;
        int ToiDa = n ;
        int res =(int)Math.ceil(ToiThieu*1.0 / m ) * m ;
        if(res <= ToiDa)
            System.out.println(res);
        else
            System.out.println(-1);
    }
}
