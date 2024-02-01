import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B2_1 {
    public static int Binary_Search(int[] a, int n, int x) {
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] == x)
                return 1;
            else if (a[mid] > x) r = mid - 1;
            else l = mid + 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        Arrays.sort(a);
        int q = sc.nextInt();
        while (q-- > 0) {
            int x = sc.nextInt();
            if (Binary_Search(a, n, x) == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
