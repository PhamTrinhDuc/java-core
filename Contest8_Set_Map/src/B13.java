import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//[Set Map]. Bài 13. Loại trừ

public class B13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        TreeSet<Integer> set = new TreeSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            map.put(b[i], 1);
        }
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(a[i])) {
                set.add(a[i]);
            }
        }
        for (int x : set) System.out.print(x + " ");
    }
}
