import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            HashMap<Character, Integer> map1 = new HashMap<>();
            HashMap<Character, Integer> map2 = new HashMap<>();
            String anagram = sc.nextLine();
            String[] arr = anagram.split("\\s+");
            for (int i = 0; i < arr[0].length(); i++) {
                char c = arr[0].charAt(i);
                map1.put(c, map1.getOrDefault(c, 0) + 1);
            }
            for (int i = 0; i < arr[1].length(); i++) {
                char c = arr[1].charAt(i);
                map2.put(c, map2.getOrDefault(c, 0) + 1);
            }
            boolean ok = true;
            for (char c : arr[0].toCharArray()) {
                if (map1.get(c) != map2.get(c)) ok = false;
            }
            if (ok) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
