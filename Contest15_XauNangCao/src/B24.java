import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        long cnt = 0;
        for (Character x : s.toCharArray()) {
            if (map.get(x) != 0) {
                cnt += (long) map.get(x) * (map.get(x) + 1) / 2;
                map.put(x, 0);
            }
        }
        System.out.println(cnt);
    }
}
