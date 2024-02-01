import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        TreeMap<String, Integer> map = new TreeMap<>();
        String[] arr = s.split("\\s+");
        for (String x : arr) map.put(x, 1);
        for (Map.Entry<String, Integer> entry : map.entrySet())
            System.out.print(entry.getKey() + " ");
        System.out.println();
        for (String x : arr) {
            if (map.get(x) != 0) {
                System.out.print(x + " ");
                map.put(x, 0);
            }
        }
    }
}
