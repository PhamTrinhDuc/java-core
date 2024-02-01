import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        boolean ok = true;
        for (int i = 0; i < n; i++) {
            if (sb.charAt(i) != '0') {
                ok = false;
            }
        }
        if (ok) System.out.println("YES");
        else System.out.println("NO");
    }
}
