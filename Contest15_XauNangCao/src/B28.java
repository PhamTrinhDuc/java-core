import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s + "@";
        Vector<String> v = new Vector<>();
        String tmp = "";
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
            } else {
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
            if (a.length() != b.length())
                return b.length() - a.length();
            return b.compareTo(a);
        });
        System.out.println(res.firstElement());
    }
}
