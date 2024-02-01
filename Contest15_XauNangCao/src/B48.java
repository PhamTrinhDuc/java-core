import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B48 {
    static boolean func(String s) {
        while (s.length() > 1) {
            int sum = 0;
            for (int i = 0; i < s.length(); i++) sum += s.charAt(i) - '0';
            s = "" + sum;
        }
        return s.equals("9");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (func(s))
            System.out.println("YES");
        else System.out.println("NO");


    }
}
