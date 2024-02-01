import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        TreeSet<Character> set1 = new TreeSet<>();
        TreeSet<Character> set2 = new TreeSet<>();
        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), 1);
        }
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (map.containsKey(c))
                map.put(c, 2);
            else set2.add(c);
        }

        for (int i = 0; i < s1.length(); i++) {
            if (map.get(s1.charAt(i)) != 2)
                set1.add(s1.charAt(i));
        }
        for (Character x : set1)
            System.out.print(x);
        System.out.println();
        for (Character x : set2)
            System.out.print(x);
    }
}
