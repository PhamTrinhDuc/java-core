import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n - 1];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < n - 1; i++) b[i] = sc.nextInt();
        int sum = a[0];
        for(int i=0 ; i<n-1 ; i++ ){
            if(b[i] == 1 ){
                sum = sum + a[i+1];
            }
            else sum = sum-a[i+1];
        }
        System.out.println(sum);
    }
}
