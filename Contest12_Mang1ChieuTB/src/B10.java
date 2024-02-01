import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        TreeMap<Integer, Integer> map = new TreeMap<>();
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            set.add(a[i]);
            map.put(a[i], 1);
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            set.add(b[i]);
            if (map.containsKey(b[i]) && map.get(b[i]) == 1)
                map.put(b[i], 2);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) System.out.print(entry.getKey() + " ");
        }
        System.out.println();
        for (int x : set) System.out.print(x + " ");
    }
}
