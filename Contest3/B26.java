import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        for(int x=0 ; x<= n/a ; x++ ){
            if(n-a*x % b== 0 ){
                System.out.println("YES");
                return ;
            }
        }
        System.out.println("NO");
    }
}
