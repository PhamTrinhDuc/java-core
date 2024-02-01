import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split("\\s+");
        int cnt = 0;
        for (String x : arr) {
            boolean ok = false;
            for (int i = 0; i < x.length(); i++) {
                if (Character.isLowerCase(x.charAt(i))) ok = true;
            }
            if (!ok) cnt++;
        }
        System.out.println(cnt);
    }
}
