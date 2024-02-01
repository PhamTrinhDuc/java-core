import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Vector<Character> v = new Vector<>();
        for (int i = 0; i < s.length(); i++) {
            v.add(s.charAt(i));
        }
        Collections.sort(v);
        for (char c : v)
            System.out.print(c);
        System.out.println();
        Collections.sort(v, Collections.reverseOrder());
        for (char c : v)
            System.out.print(c);
    }
}
