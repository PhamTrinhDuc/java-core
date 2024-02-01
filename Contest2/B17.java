import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.io.*;
import java.util.*;

public class B17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if(c <='z' && c >= 'a')
            System.out.println("LOWER");
        else if(c >= 'A' && c <= 'Z')
            System.out.println("UPPER");
        else if(c >= '0' && c <= '9')
            System.out.println("DIGIT");
        else
            System.out.println("SPECIAL");
    }
}
//Character.isUpperCase
//Character.isDigit
//Character.isLowerCase