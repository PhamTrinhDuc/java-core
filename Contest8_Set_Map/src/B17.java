import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//[Set Map]. Bài 17. Truy vấn kí tự

public class B17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        HashMap<Character, Integer> map = new HashMap<>();

        char max_c = 'a', min_c = 'a';
        int max_freq = Integer.MIN_VALUE, min_freq = Integer.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            set.add(tmp);
            if (map.containsKey(tmp)) {
                map.put(tmp, map.get(tmp) + 1);
            } else map.put(tmp, 1);
        }
        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            if (map.get(tmp) > max_freq || (map.get(tmp) == max_freq && tmp < min_c)) {
                min_c = tmp;
                max_freq = map.get(tmp);
            }
            if (map.get(tmp) < min_freq || (map.get(tmp) == min_freq && tmp > max_c)) {
                max_c = tmp;
                min_freq = map.get(tmp);
            }
        }
        System.out.println(min_c + " " + max_freq);
        System.out.println(max_c + " " + min_freq);
        System.out.println(set.size());
    }
}
