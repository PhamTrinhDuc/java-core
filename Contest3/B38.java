import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n; j++) {
                if(i%2==0){
                    if(j%2==0) System.out.print(0);
                    else System.out.print(1);
                }
                else{
                    if(j%2==0) System.out.print(1);
                    else System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
