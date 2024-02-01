import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.io.*;
import java.util.*;
public class B18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if(Character.isUpperCase(c))
            System.out.println((char)(c+32));
        else if(Character.isLowerCase(c))
            System.out.println((char)(c-32));
        else
            System.out.println(c);
    }
}
