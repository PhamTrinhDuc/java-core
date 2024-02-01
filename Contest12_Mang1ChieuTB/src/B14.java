import javax.print.DocFlavor;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B14 {
    public static boolean check(int n) {
        int tmp = n % 10;
        while (n != 0) {
            if (tmp < n % 10) return false;
            tmp = n % 10;
            n /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        while (sc.hasNextInt()) {
            int tmp = sc.nextInt();
            if (check(tmp)) {
                arr.add(tmp);
                if (map.containsKey(tmp)) {
                    map.put(tmp, map.get(tmp) + 1);
                } else map.put(tmp, 1);
            }
        }
        Collections.sort(arr, (a, b) -> {
            if (map.get(a) != map.get(b))
                return map.get(b) - map.get(a);
            return a - b;
        });
        for (int i = 0; i < arr.size(); i++) {
            if (map.get(arr.get(i)) != 0) {
                System.out.println(arr.get(i) + " " + map.get(arr.get(i)));
                map.put(arr.get(i), 0);
            }
        }
    }
}
