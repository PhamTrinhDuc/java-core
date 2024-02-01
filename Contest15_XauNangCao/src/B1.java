import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt_digit = 0, cnt_alpha = 0, cnt_special = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isAlphabetic(c)) cnt_alpha++;
            else if (Character.isDigit(c)) cnt_digit++;
            else cnt_special++;
        }
        System.out.println(cnt_alpha + " " + cnt_digit + " " + cnt_special);
    }
}
