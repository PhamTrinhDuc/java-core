import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class test {
    static int n, m;
    static List<Integer>[] adj = new ArrayList[1005];
    static int[] color = new int[1005];

    static boolean DFS(int u) {
        color[u] = 1;
        for (int v : adj[u]) {
            if (color[v] == 0) {
                if (DFS(v)) return true;
            } else if (color[v] == 1) return true;
        }
        color[u] = 2;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            adj[x].add(y);
//            adj[y].add(x);
        }
        if (DFS(1)) System.out.println("YES");
        else System.out.println("NO");
    }
}
//6  9
//1 2 1 3 2 3 2 5 3 4 3 5 4 5 4 6 6 5