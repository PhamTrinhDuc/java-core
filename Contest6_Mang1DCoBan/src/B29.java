import java.util.Scanner;

public class B29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] cnt = new int[1000006];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            cnt[a[i]]++;
        }
        int max_freq = -1, res = 0;
        for (int i = 0; i < n; i++) {
            if (cnt[a[i]] > max_freq) {
                max_freq = cnt[a[i]];
                res = a[i];
            } else if ((cnt[a[i]] >= max_freq && a[i] < res)) res = a[i];
        }
        System.out.println(res + " " + max_freq);
    }
}
