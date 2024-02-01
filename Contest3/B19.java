import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int SoChai = n / 28 ;
        long res = SoChai;
        while(SoChai >= 3 ){
            res += SoChai / 3 ;
            SoChai = SoChai/3 + SoChai%3 ;
        }
        System.out.println(res);
    }
}
