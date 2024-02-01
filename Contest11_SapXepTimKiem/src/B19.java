import java.util.Arrays;
import java.util.Scanner;

public class B19 {
    public static int FindPos(int[] a, int l, int r, int k) {
        int res = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a[mid] > k) {
                res = mid;
                r = mid - 1;
            } else l = mid + 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        long cnt = 0;
        for (int i = 0; i < n; i++) {
            int l = FindPos(arr, i + 1, n - 1, k - arr[i]);
            if (l != -1) cnt += n - l;
        }
        System.out.println(cnt);
    }
}
