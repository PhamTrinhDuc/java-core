import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B12 {
    static boolean check(String s) {
        StringBuilder sb = new StringBuilder(s);
        if (sb.reverse().toString().equals(s)) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split("\\s+");
        Vector<String> v = new Vector<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (String x : arr) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else map.put(x, 1);
            if (check(x) && map.get(x) == 1) {
                v.add(x);
            }
        }
        Collections.sort(v, (a, b) -> {
            return a.length() - b.length();
        });
        for (String x : v)
            System.out.print(x + " ");
    }
}
