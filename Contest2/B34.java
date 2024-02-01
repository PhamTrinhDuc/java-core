import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int c3 = sc.nextInt();
        int c4 = sc.nextInt();
        int c5 = sc.nextInt();
        if((c1 + c2 + c3 + c4 + c5 ) % 5 == 0 ){
            if((c1 + c2 + c3 + c4 + c5 )/5 != 0 )
                System.out.println((c1 + c2 + c3 + c4 + c5 )/5 );
            else
                System.out.println(-1);
        }
        else
            System.out.println(-1);
    }
}
