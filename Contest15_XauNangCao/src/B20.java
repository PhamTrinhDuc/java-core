import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int idx = 0;
        String tmp = "python";
        boolean ok = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == tmp.charAt(idx)) idx++;
            if (idx == 6) {
                ok = true;
                break;
            }
        }
        if (ok) System.out.println("YES");
        else System.out.println("NO");
    }
}
