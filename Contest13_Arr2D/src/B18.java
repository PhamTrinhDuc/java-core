import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B18 {
    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n + 5][m + 5];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) a[i][j] = sc.nextInt();
        }
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                boolean ok = true;
                for (int k = 0; k < 8; k++) {
                    int i1 = i + dx[k];
                    int j1 = j + dy[k];
                    if (i1 >= 1 && i1 <= n && j1 >= 1 && j1 <= m && a[i1][j1] >= a[i][j]) {
                        ok = false;
                        break;
                    }
                }
                if (ok) cnt++;
            }
        }
        System.out.println(cnt);
    }
}
