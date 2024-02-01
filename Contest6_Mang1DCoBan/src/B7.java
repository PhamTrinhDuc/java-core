import java.util.Scanner;
import java.lang.String;

public class B7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                res = Math.min(res, Math.abs(a[i] - a[j]));
            }
        }
        System.out.println(res);
    }
}
