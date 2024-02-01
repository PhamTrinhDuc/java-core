import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean ok = false;
        for (int i = 1; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(i - 1);
            if (Math.abs(c1 - c2) != 1) {
                ok = true;
            }
        }
        if (!ok) System.out.println("YES");
        else System.out.println("NO");
    }
}
