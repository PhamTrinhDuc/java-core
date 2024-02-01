import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// truy van phan tu trong mang

public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            set.add(tmp);
        }
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            if (set.contains(x))
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
