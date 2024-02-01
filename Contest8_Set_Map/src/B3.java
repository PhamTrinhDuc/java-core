import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// phan tu rieng biet

public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> Arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            Arr.add(tmp);
        }

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int x : Arr) {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else map.put(x, 1);
        }

        for (int x : Arr) {
            if (map.get(x) != 0) {
                System.out.print(x + " ");
                map.put(x, 0);
            }
        }
    }
}
