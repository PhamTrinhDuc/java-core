import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

// day nguyen to dai nhat

public class B47 {
    public static int[] F = new int[1000006];
    public static void sang() {
        for (int i = 2; i <= (int) 1e6; i++) {
            F[i] = 1;
        }
        for (int i = 2; i <= Math.sqrt((int) 1e6); i++) {
            if (F[i] == 1) {
                for (int j = i * i; j <= (int) 1e6; j+=i)
                    F[j] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sang();
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for(int i=0 ; i<n ; i++ ) a[i] = sc.nextInt();
        // TH day ket qua la day chua so cuoi cung la so nguyen to
        a[n] = 10;
        int dem = 0 , sum =0 ;
        int len = -1 , max_sum = -1, end = 0 ;

        for(int i=0 ;i <=n ; i++ ){
            if(F[a[i]] == 1 ){
                dem++; sum += a[i];
//                System.out.println(dem + " " + sum );
            }
            else{
                if(dem > len  ){
                    max_sum =sum ;
                    len = dem ; end = i-1 ;
                    sum = 0 ; dem = 0 ;
                }
                else if(dem == len ){
                    if(sum > max_sum) {
                        max_sum = sum;
                        end = i - 1;
                        sum = 0;
                        dem = 0;
                    }
                }
                else {
//                    2 2 3 5 7 0 5 3 2 7 0 2 5 5 0
                    dem = 0 ; sum = 0 ;
                }
            }
        }
        if(len != 0) {
            System.out.println(len);
            for (int i = end - len + 1; i <= end; i++)
                System.out.print(a[i] + " ");
        }
        else System.out.println("NOT FOUND");
    }
}
//15
//1 2 3 5 0 5 3 2 0 0 2 5 5 5 5
