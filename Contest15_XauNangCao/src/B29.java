import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s + "@";
        Vector<String> v = new Vector<>();
        String tmp = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                tmp += s.charAt(i);
            } else {
                if (!tmp.isEmpty()) v.add(tmp);
                tmp = "";
            }
        }
        long sum = 0;
        for (String x : v) {
            sum += Long.parseLong(x);
        }
        System.out.println(sum);
    }
}
