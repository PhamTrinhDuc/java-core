import java.util.Scanner;
import java.lang.Math;
import java.io.*;
import java.util.*;
public class B25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num1 = n/ 100;
        int tmp1 = n - (n/100)*100;
        int num2 = tmp1 / 20;
        int tmp2 = tmp1 - (tmp1/20)*20;
        int num3 = tmp2 / 10 ;
        int tmp3 = tmp2 - (tmp2/10)*10;
        int num4 = tmp3 / 5 ;
        int tmp4 = tmp3 - (tmp3/5)*5 ;
//        System.out.println(num1+" "+num2+" "+num3+" "+num4+" "+tmp4 );
        System.out.println(num1 + num2 + num3 + num4 + tmp4 );

    }
}
