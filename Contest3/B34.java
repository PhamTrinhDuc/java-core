import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;
public class B34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int tmp = i ;
            for (int j = 1; j <= 2 * n - 1; j++) {
                if (j <= n + i - 1 && j >= n - i + 1){
                    if(j < n )
                        System.out.print(tmp++ + " ");
                    else
                        System.out.print(tmp-- + " ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
