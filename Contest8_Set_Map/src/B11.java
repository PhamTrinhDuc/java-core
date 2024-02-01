import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Difference

public class B11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < m; i++) b[i] = sc.nextInt();

        // C1: su dung TreeSet
//        TreeSet<Integer> set = new TreeSet<>();
//        for (int i = 0; i < n; i++) {
//            set.add(a[i]);
//        }
//        for (int i = 0; i < m; i++) {
//            if (set.contains(b[i])) {
//                set.remove((Object) b[i]);
//            }
//        }
//        for (int x : set) System.out.print(x + " ");

        // C2: su dung TreeSet va TreeMap
        TreeMap<Integer, Integer> map = new TreeMap<>();
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < m; i++) {
            if (map.containsKey(b[i])) {
                map.put(b[i], map.get(b[i]) + 1);
            } else map.put(b[i], 1);
        }
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(a[i]))
                set.add(a[i]);
        }
        for (int x : set)
            System.out.print(x + " ");
    }
}
