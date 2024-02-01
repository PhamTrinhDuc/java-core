import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//  Intersection

public class B10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // C1: su dung 2 LinkedHashSet
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
//        int[] b = new int[m];
//        LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
//        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
//        for (int i = 0; i < m; i++) {
//            b[i] = sc.nextInt();
//            set1.add(b[i]);
//        }
//        for (int x : a) {
//            if (set1.contains(x)) {
//                set2.add(x);
//            }
//        }
//        for (int x : set2) {
//            System.out.print(x + " ");
//        }

        // C2: su dung LinkedHashMap
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            if (map.containsKey(b[i])) {
                map.put(b[i], map.get(b[i]) + 1);
            } else {
                map.put(b[i], 1);
            }
        }

        for (int i = 0; i < n; i++) {
            if (map.containsKey(a[i]) && map.get(a[i]) != 0) {
                System.out.print(a[i] + " ");
                map.put(a[i], 0);
            }
        }
    }
}
