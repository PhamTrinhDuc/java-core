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
        s = s.toLowerCase();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) map.put(s.charAt(i), 1);
        boolean ok = true;
        for (int i = 97; i <= 122; i++) {
            if (!map.containsKey((char) i)) ok = false;
        }
        if (ok) System.out.println("YES");
        else System.out.println("NO");
    }
}
