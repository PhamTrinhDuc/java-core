import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String tmp = "28tech";
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            boolean ok = false;
            for (int j = 0; j < tmp.length(); j++) {
                char c1 = s.charAt(i);
                char c2 = tmp.charAt(j);
                if (c1 == c2) {
                    ok = true;
                }
            }
            if (!ok) res += s.charAt(i);
        }
        if (res.isEmpty())
            System.out.println("EMPTY");
        else
            System.out.println(res);
    }
}
