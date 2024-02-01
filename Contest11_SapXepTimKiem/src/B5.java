import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        Integer[] arr = new Integer[n];
        int res = -1, freq_res = -1;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else map.put(arr[i], 1);
        }
        for (int i = 0; i < n; i++) {
            if (map.get(arr[i]) > freq_res) {
                res = arr[i];
                freq_res = map.get(arr[i]);
            } else if (map.get(arr[i]) == freq_res && arr[i] < res) res = arr[i];
        }
        System.out.println(res + " " + freq_res);

    }
}
