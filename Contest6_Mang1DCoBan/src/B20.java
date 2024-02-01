import java.awt.*;
import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] a = new int[n];
        for(int i=0 ; i<n ; i++ )a[i] =sc.nextInt();
        for(int i=1 ;i <=n-2 ; i++ ){
            if(a[i] > a[i+1] && a[i] > a[i-1])
                System.out.print(a[i] + " ");
        }
    }
}
