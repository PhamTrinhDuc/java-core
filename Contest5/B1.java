import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B1 {
    public static int UocNt(long n) {
        int cnt =0 ;
        for(int i=2 ;i <=Math.sqrt(n) ; i++ ){
            if(n%i==0){
                cnt++;
                while(n%i==0){
                    n/=i ;
                }
            }
        }
        if(n!=1) cnt++;
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(UocNt(n));
    }
}
