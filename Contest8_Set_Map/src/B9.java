import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.lang.*;
import java.util.regex.*;

// Union

public class B9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            set.add(tmp);
        }
        for (int i = 0; i < m; i++) {
            int tmp = sc.nextInt();
            set.add(tmp);
        }
        for (Integer num : set.descendingSet()) {
            System.out.print(num + " ");
        }
    }
}
