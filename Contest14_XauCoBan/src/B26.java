import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B26 {
    static boolean Check(String s) {
        int n = s.length() - 1;
        int c_0 = s.charAt(0) - '0', c_n = s.charAt(n) - '0';
        if ((c_0 % 2 == 0 && c_n % 2 == 1) || (c_0 % 2 == 1 && c_n % 2 == 0)) return false;
        for (int i = 1; i <= n; i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(i - 1);
            if (Math.abs(c1 - c2) == 3) return false;
            if (c1 == '2' && c2 == '8') return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            if (Check(s))
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
