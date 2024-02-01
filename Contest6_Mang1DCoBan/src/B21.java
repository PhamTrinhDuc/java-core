import java.util.Scanner;

public class B21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] cnt1 = new int[1005];
        int[] cnt2 = new int[1005];

        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            cnt1[a[i]]++;
            cnt2[a[i]]++;
        }

        int res_max = 0, res_min = 0, min_freq = Integer.MAX_VALUE, max_freq = Integer.MIN_VALUE;

        for (int x : a) {
            if (cnt1[x] > max_freq || (cnt1[x] == max_freq && x > res_max)) {
                max_freq = cnt1[x];
                res_max = x;
            }

            if (cnt2[x] < min_freq || (cnt2[x] == min_freq && x < res_min)) {
                min_freq = cnt2[x];
                res_min = x;
            }
        }

        for (int x : a) {
            if (cnt1[x] != 0) {
                System.out.println(x + " " + cnt1[x]);
                cnt1[x] = 0;
            }
        }

        System.out.println();

        for (int i = 0; i < 1005; i++) {
            if (cnt2[i] != 0) {
                System.out.println(i + " " + cnt2[i]);
                cnt2[i] = 0;
            }
        }

        System.out.println();
        System.out.println(res_max);
        System.out.println(res_min);
    }
}