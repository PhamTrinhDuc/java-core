import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        s = s.toLowerCase();
        t = t.toLowerCase();
        HashMap<String, Integer> map = new HashMap<>();
        TreeSet<String> set = new TreeSet<>();
        String[] arr1 = s.split("\\s+");
        for (String x : arr1) map.put(x, 1);
        String[] arr2 = t.split("\\s+");
        for (String x : arr2) {
            if (map.containsKey(x) && map.get(x) == 1) set.add(x);
        }
        for (String x : set)
            System.out.print(x + " ");
    }
}
