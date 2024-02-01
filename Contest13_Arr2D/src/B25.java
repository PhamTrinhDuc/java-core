import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.logging.XMLFormatter;
import java.util.regex.*;

public class B25 {
    static int n, m, cnt;
    static int[][] a = new int[505][505];
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};

    static void Loang(int i, int j) {
        a[i][j] = 0;
        cnt++;
        for (int k = 0; k < 4; k++) {
            int i1 = i + dx[k];
            int j1 = j + dy[k];
            if (i1 >= 1 && i1 <= n && j1 >= 1 && j1 <= m && a[i1][j1] == 1) {
                Loang(i1, j1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) a[i][j] = sc.nextInt();
        }
        int res = -1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                cnt = 0;
                if (a[i][j] == 1) {
                    Loang(i, j);
                    res = Math.max(res, cnt);
                }
            }
        }
        System.out.println(res);
    }
}
