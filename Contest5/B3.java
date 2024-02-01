import java.security.KeyPair;
import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;
import java.util.Vector;


public class B3 {
    public static int[] cnt = new int[1000005];
    public static void func(int n ){
        Vector<Integer> v = new Vector<>();
        for(int i=2 ;i<=Math.sqrt(n) ; i++ ){
            if(n%i==0){
                int dem = 0  ;
                while(n%i==0){
                    n/=i ;dem++;
                }
                cnt[i] = dem;
                v.add(i);
            }
        }
        if(n!=1) {
            v.add(n); cnt[n] = 1 ;
        }

        for(int x: v ) System.out.print(x + " ");
        System.out.println();

        for(int x : v ){
            System.out.print("(" + x + ", " + cnt[x] + ") ");
        }
        System.out.println();

        for(int j=0 ; j<v.size() ;j++ ){
            while(cnt[v.get(j)]!=0){
                System.out.print(v.get(j));
                if(cnt[v.get(j)]!=1) System.out.print(" x ");
                cnt[v.get(j)]--;
            }
            if(j != v.size()-1) System.out.print(" x ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        func(n);
    }
}
