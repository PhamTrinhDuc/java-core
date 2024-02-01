import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

// 2 8 t e c h

public class B49 {
    public static int[] cnt = new int[256];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] c = new char[n];
        for (int i = 0; i < n; i++) {
            c[i] = sc.next().charAt(0);
        }
        String s = "28tech";
        int idx = 0, ok = 0 ;
        for (int i = 0; i < n; i++) {
            if (c[i] == s.charAt(idx) && i % 2 == 0) {
                idx++;
                if(idx == s.length()){
                    System.out.println("28TECH");
                    ok = 1 ; break;
                }
            }
        }
       if(ok == 0 ) System.out.println("HCET82");
    }
}
