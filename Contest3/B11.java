import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;
public class B11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        int sum = 0 ;
        for(int i= 1; i<=n ; i++ ){
            if(i %2 == 1 ){
                sum += -1*i ;
            }
            else
                sum += i ;
        }
        System.out.println(sum);
    }
}
