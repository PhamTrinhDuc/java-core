import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//[Set Map]. Bài 12. Symmetric difference

public class B12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        HashMap<Integer, Integer> map = new HashMap<>();
        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            map.put(a[i], 1);
        }

        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            if (!map.containsKey(b[i])) set.add(b[i]);
            else map.put(b[i], 2);
        }

        for (int i = 0; i < n; i++) {
            if (map.get(a[i]) != 2) {
                set.add(a[i]);
            }
        }
        for (int x : set) System.out.print(x + " ");
    }
}
