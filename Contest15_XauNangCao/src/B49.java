import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s + "0";
        String tmp = "";
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '1') {
                tmp += sb.charAt(i);
                if (tmp.length() == 3) {
                    sb.delete(i - 2, i + 1);
                    tmp = "";
                    i = i - 3;
                }
            }
            else tmp = "";
        }
        sb.deleteCharAt(s.length() - 1);
        if (sb.isEmpty())
            System.out.println("EMPTY");
        else System.out.println(sb);
    }
}
