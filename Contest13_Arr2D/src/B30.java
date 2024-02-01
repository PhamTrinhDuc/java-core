import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B30 {
    static int n, cnt = 0;
    static int[][] a = new int[25][25];
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};

    static void loang(int i, int j) {
        cnt++;
        a[i][j] = 1;
        for (int k = 0; k < 4; k++) {
            int i1 = i + dx[k];
            int j1 = j + dy[k];
            if (i1 >= 1 && i1 <= n && j1 >= 1 && j1 <= n && a[i1][j1] == 0) {
                loang(i1, j1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) a[i][j] = sc.nextInt();
        }
        loang(s, t);
        System.out.println(cnt);
    }
}
