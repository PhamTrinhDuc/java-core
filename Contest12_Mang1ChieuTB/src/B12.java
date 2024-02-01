import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B12 {
    public static boolean check(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return n > 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        Vector<Integer> v = new Vector<>();
        while (sc.hasNextInt()) {
            int tmp = sc.nextInt();
            if (check(tmp)) {
                v.add(tmp);
                if (map.containsKey(tmp)) {
                    map.put(tmp, map.get(tmp) + 1);
                } else map.put(tmp, 1);
            }
        }
        for (int x : v) {
            if (map.get(x) != 0) {
                System.out.println(x + " " + map.get(x));
                map.put(x, 0);
            }
        }
    }
}
