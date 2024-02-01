import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B27 {
    static boolean check(String s) {
        int idx = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '@') idx = i;
        }
        String tail = s.substring(idx);
        if (!tail.equals("@gmail.com") && !tail.equals("@28tech.com.vn") && !tail.equals("@yahoo.com") && !tail.equals("@hotmail.com"))
            return false;
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '@' && c != '.' && c != '_' && !Character.isDigit(c) && !Character.isAlphabetic(c))
                return false;
            if (c == '@') cnt++;
            if (cnt >= 2) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            if (check(s))
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
