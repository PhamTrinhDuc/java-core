import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// [Set Map]. Bài 14. Suffix And Query

public class B14 {
    public static int[] F = new int[1000005];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            set.add(a[i]);
            F[i] = set.size();
        }
        int t = sc.nextInt();
        while (t-- > 0) {
            int l = sc.nextInt();
            System.out.println(F[l]);
        }
    }
}
