import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// phan tu xuat hien o moi hang

public class B7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            map.put(tmp, 1);
        }
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = sc.nextInt();
                if (map.containsKey(tmp) && map.get(tmp) == i - 1) {
                    map.put(tmp, i);
                }
                if (map.containsKey(tmp) && map.get(tmp) == n) set.add(tmp);
            }
        }
        if (set.isEmpty())
            System.out.println("NOT FOUND");
        else {
            for (int x : set)
                System.out.print(x + " ");
        }
    }
}
