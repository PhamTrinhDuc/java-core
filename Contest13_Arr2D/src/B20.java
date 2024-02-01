import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B20 {
    static int n, m, s, t, u, v;
    static int[][] a = new int[105][105];
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};

    static void Loang(int i, int j) {
        a[i][j] = 0;
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
        s = sc.nextInt();
        t = sc.nextInt();
        u = sc.nextInt();
        v = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) a[i][j] = sc.nextInt();
        }
        Loang(s, t);
        if (a[u][v] == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}
