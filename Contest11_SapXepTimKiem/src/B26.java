import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B26 {
    public static boolean BS(int[] a, int l, int r, int x) {
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] == x) return true;
            else if (a[mid] > x) r = mid - 1;
            else l = mid + 1;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        boolean ok = false;
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            if (BS(a, i + 1, n - 1, a[i] + x)) {
                System.out.println(1);
                ok = true;
                break;
            }
        }
        if (!ok) System.out.println(-1);
    }
}
