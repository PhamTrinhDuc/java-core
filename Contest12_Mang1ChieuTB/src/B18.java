import javax.script.ScriptContext;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (map.containsKey(a[i])) map.put(a[i], map.get(a[i]) + 1);
            else map.put(a[i], 1);
        }
        long res = 0;
        for (int i = 0; i < n; i++) {
            if (map.get(a[i]) != 0) {
                res += ((long) map.get(a[i]) * (map.get(a[i]) - 1) / 2);
                map.put(a[i], 0);
            }
        }
        System.out.println(res);
    }

}

