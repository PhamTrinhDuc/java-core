import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s + " ";
        String tmp1 = "", res = "";
        tmp1 += s.charAt(0);
        int len = -1, cnt = 1;
        for (int i = 1; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(i - 1);
            if (c1 == c2) {
                cnt++;
                tmp1 += c1;
            } else {
                if (cnt > len) {
                    len = cnt;
                    res = tmp1;
                } else if (len == cnt && tmp1.compareTo(res) > 0) res = tmp1;
                cnt = 1;
                tmp1 = String.valueOf(c1);
            }
        }
        System.out.println(res);
    }
}
