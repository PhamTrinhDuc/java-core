import java.io.*;
import java.net.NetworkInterface;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// [Set Map]. Bài 22. Số lần xuất hiện

public class B22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else map.put(a[i], 1);
            System.out.print(map.get(a[i]) + " ");
        }
    }
}
