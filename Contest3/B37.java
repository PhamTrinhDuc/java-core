import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;
public class B37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if(j==i || j==n-i+1 )
                    System.out.print(i + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
