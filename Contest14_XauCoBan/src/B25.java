import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            boolean ok = false;
            for (int i = 0; i < s.length(); i++) {
                if (!Character.isDigit(s.charAt(i))) ok = true;
            }
            if ((s.length() != 10 && s.length() != 11) || s.charAt(0) != '0') ok = true;
            if (!ok)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
