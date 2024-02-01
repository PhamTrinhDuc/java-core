import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split("\\s+");
        HashMap<String, Integer> map = new HashMap<>();
        for (String x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        String s_min = " ", s_max = " ";
        int min_freq = (int) 1e9, max_freq = (int) -1e9;
        for (String x : arr) {
            if (map.get(x) < min_freq || (map.get(x) == min_freq && x.compareTo(s_min) > 0)) {
                min_freq = map.get(x);
                s_min = x;
            }
            if (map.get(x) > max_freq || (map.get(x) == max_freq && x.compareTo(s_max) > 0)) {
                s_max = x;
                max_freq = map.get(x);
            }
        }
        System.out.println(s_max + " " + max_freq);
        System.out.println(s_min + " " + min_freq);
    }
}
