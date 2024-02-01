import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 1
        for (int i = 3; i <= n; i += 3)
            System.out.print(i + " ");
        System.out.println();
        // 2
        for(int i=0 ;i <n ;i++ ) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.print(i + " ");
        }
        System.out.println();
        // 3
        int tmp = n ;
        while(true){
            if (tmp % 7== 0 ){
                System.out.println(tmp);
                break;
            }
            tmp++ ;
        }
        // 4
        for(int i=n ; i>=0 ; i-- ){
            if(i % 9 == 0 ) {
                System.out.println(i);
                break;
            }
        }
        // 5
        for(int i=1 ; i<=2*n-1 ; i+=2 )
            System.out.print(i + " ");
    }
}
