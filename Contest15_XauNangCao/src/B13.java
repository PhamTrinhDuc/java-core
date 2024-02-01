import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        TreeMap<String, Integer> map = new TreeMap<>();
        String[] arr = s.split("\\s+");
        for (String x : arr) {
            if (map.containsKey(x))
                map.put(x, map.get(x) + 1);
            else map.put(x, 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println();
        for (String x : arr) {
            if (map.get(x) != 0) {
                System.out.println(x + " " + map.get(x));
                map.put(x, 0);
            }
        }
    }
}
