import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// [Set Map]. Bài 23. Liệt kê tần suất chẵn

public class B23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else map.put(a[i], 1);
        }

        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            if (entry.getValue() % 2 == 0)
                System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println();
        // duyet nguoc map
        for (Map.Entry<Integer, Integer> entry : map.descendingMap().entrySet()) {
            if (entry.getValue() % 2 == 0)
                System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
