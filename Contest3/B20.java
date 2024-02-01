import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 1 )
            System.out.println(-1);
        else{
            if(n%2==0){
                String TwoString = "2 ".repeat(n/2);
                System.out.println(n/2 + "\n" + TwoString);
            }
            else{
                int tmp = n ;
                n = n/2 - 1 ;
                String TwoString = "2 ".repeat(n) + "3";
                System.out.println(tmp/2 + "\n" + TwoString);
            }
        }
    }
}
