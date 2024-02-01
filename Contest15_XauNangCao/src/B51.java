import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s + "#";
        int cnt = 1;
        for (int i = 1; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(i - 1);
            if (c1 == c2) {
                cnt++;
            } else {
                System.out.print(c2 + "" + cnt);
                cnt = 1;
            }
        }
    }
}
