import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// tan suat ki tu
public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] c = new char[n];
        for (int i = 0; i < n; i++) {
            c[i] = sc.next().charAt(0);
        }
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(c[i])) {
                map.put(c[i], map.get(c[i]) + 1);
            } else map.put(c[i], 1);
        }

        char firstKey = map.firstKey(), lastKey = map.lastKey();
        System.out.println(firstKey + " " + map.get(firstKey) + "\n");

        System.out.println(lastKey + " " + map.get(lastKey) + "\n");

        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println();

        for (int i = 122; i >= 65; i--) {
            if (map.containsKey((char) i)) {
                System.out.println((char) (i) + " " + map.get((char) (i)));
            }
        }
    }
}
