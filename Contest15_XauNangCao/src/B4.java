import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else map.put(c, 1);
        }

        char c_min = ' ', c_max = ' ';
        int freq_min = (int) 1e9, freq_max = (int) -1e9;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.get(c) > freq_max || (map.get(c) == freq_max && c > c_max)) {
                c_max = c;
                freq_max = map.get(c);
            }
            if (map.get(c) < freq_min || (map.get(c) == freq_min && c > c_min)) {
                c_min = c;
                freq_min = map.get(c);
            }
        }
        System.out.println(c_max + " " + freq_max);
        System.out.println(c_min + " " + freq_min);

    }
}
