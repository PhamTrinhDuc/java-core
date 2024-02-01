import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B34 {
    static boolean check1(String s) {
        for (int i = 1; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(i - 1);
            if (c1 - c2 < 0) return false;
        }
        return true;
    }

    static boolean check2(String s) {
        for (int i = 1; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(i - 1);
            if (c2 - c1 < 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (check1(s) || check2(s)) System.out.println("YES");
        else System.out.println("NO");
    }
}
