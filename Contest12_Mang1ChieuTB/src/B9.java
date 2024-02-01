import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else map.put(a[i], 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            if (map.get(a[i]) != 0) {
                System.out.println(a[i] + " " + map.get(a[i]));
                map.put(a[i], 0);
            }
        }
    }
}
