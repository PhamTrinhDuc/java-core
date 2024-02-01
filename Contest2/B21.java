import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.io.*;
import java.util.*;

public class B21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        if(k%2 == 0 ) System.out.println(1L*(k/2)* (a - b));
        else System.out.println(1L*(k/2)*(a-b) + a );

    }
}
