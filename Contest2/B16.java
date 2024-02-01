import java.util.Scanner;
import java.lang.Math;
import java.io.*;
import java.util.*;

public class B16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if ( c == 'z' || c == 'Z')
            System.out.println('a');
        else{
            if (c<='z' && c>='a')
                System.out.println((char)(c+1));
            else
                System.out.println((char)(c+33));
        }
    }
}
