import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s + "@";
        Vector<String> v = new Vector<>();
        String tmp = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)))
                tmp += s.charAt(i);
            else {
                if (!tmp.isEmpty()) v.add(tmp);
                tmp = "";
            }
        }
        Vector<String> res = new Vector<>();
        for (String x : v) {
            int idx = 0;
            while (idx < x.length() && x.charAt(idx) == '0') idx++;
            if (idx == x.length()) res.add("0");
            else res.add(x.substring(idx));
        }
        Collections.sort(res, (a, b) -> {
            String s1 = a + b;
            String s2 = b + a;
            return s2.compareTo(s1);
        });
        for (String x : res)
            System.out.print(x);
    }
}
