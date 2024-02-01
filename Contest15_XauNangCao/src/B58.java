import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            String newS = s.replace("+", " ");
            String[] arr = newS.split("\\s+");
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for (String x : arr) {
                int idx1 = x.indexOf('x');
                int idx2 = x.indexOf('^');
                int hangSo = Integer.parseInt(x.substring(0, idx1));
                int soMu = Integer.parseInt(x.substring(idx2 + 1));
                if (map.containsKey(soMu)) {
                    map.put(soMu, map.get(soMu) + hangSo);
                } else map.put(soMu, hangSo);
            }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                System.out.print(entry.getValue() + "x^" + entry.getKey());
                if (entry.getKey() != map.lastKey()) System.out.print(" + ");
            }
            System.out.println();
        }
    }
}
