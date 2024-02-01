import javax.script.ScriptContext;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int crr_len = -1, max_len = -1;
        int st = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] <= a[i - 1]) {
                crr_len = Math.max(crr_len, i - st);
                max_len = Math.max(max_len, crr_len);
            }
        }
    }
}
