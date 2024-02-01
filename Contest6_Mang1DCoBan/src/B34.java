import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B34 {
    public static int[] cnt = new int[1000006];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int tmp = a[0];
        System.out.print(a[0] + " ");
        for(int i=1 ; i<n ; i++ ){
            if(a[i] != a[i-1]){
                System.out.print(a[i] + " ");
            }
        }
    }
}
//11
//2 3 3 0 0 0 3 3 3 3 4 4