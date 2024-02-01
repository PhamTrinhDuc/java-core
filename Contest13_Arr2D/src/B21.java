import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B21 {
    static int n;
    static int[][] a = new int[105][105];
    static int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
    static int[] dy = {-1, 1, -2, 2, -2, 2, -1, 1};

    static void loang(int i, int j) {
        a[i][j] = 0;
        for (int k = 0; k < 8; k++) {
            int i1 = i + dx[k];
            int j1 = j + dy[k];
            if (i1 >= 1 && i1 <= n && j1 >= 1 && j1 <= n && a[i1][j1] == 1) {
                loang(i1, j1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();
        int u = sc.nextInt();
        int v = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++)
                a[i][j] = sc.nextInt();
        }
        loang(s, t);
        if (a[u][v] == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
