import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B33 {
    static boolean check(String s) {
        StringBuilder sb = new StringBuilder(s);
        boolean ok = false;
        for (char c : s.toCharArray()) {
            if (c == '6') ok = true;
        }
        if (ok && sb.reverse().toString().equals(s)) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (check(s))
            System.out.println("YES");
        else System.out.println("NO");
    }
}
