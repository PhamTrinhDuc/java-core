import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B9 {
    public static boolean BS(int[] a, int n, int x) {
        int l = 0, r = n - 1;
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
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int q = sc.nextInt();
        while (q-- > 0) {
            int x = sc.nextInt();
            if (BS(arr, n, x))
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
