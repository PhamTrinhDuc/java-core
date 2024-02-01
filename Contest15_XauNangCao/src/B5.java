import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        TreeMap<Character, Integer> map = new TreeMap<>();
        TreeSet<Character> set1 = new TreeSet<>();
        TreeSet<Character> set2 = new TreeSet<>();
        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), i);
            set1.add(s1.charAt(i));
        }
        for (int i = 0; i < s2.length(); i++) {
            set1.add(s2.charAt(i));
            if (map.containsKey(s2.charAt(i)))
                set2.add(s2.charAt(i));
        }
        for (Character x : set2)
            System.out.print(x);
        System.out.println();
        for (Character x : set1)
            System.out.print(x);
    }
}
