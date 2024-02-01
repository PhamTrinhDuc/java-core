import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Vector<Character> v = new Vector<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '0') v.add(c);
        }
        if (v.isEmpty()) System.out.print(0);
        else {
            Collections.sort(v);
            for (char c : v)
                System.out.print(c);
        }
    }
}
