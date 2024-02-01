import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

// tong cua moi day con

public class B43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0 ; i<n ; i++ ) a[i] = sc.nextInt();
        for(int i=0 ; i<n; i++ ){
            int sum = a[i];
            System.out.print(sum + " ");
            for(int j=i+1 ; j<n ; j++ ){
                sum += a[j];
                System.out.print(sum + " ");
            }
        }
    }
}
