import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            min = Math.min(a[i], min);
            max = Math.max(a[i], max);
        }
        System.out.println(min);
        for(int i=0 ; i<n ; i++ ){
            if(a[i]== min )
                System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(max);
        for(int i=n-1 ; i>=0 ; i-- ){
            if(a[i]== max )
                System.out.print(i + " ");
        }
    }
}
