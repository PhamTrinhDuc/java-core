import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int cnt50 = 0, cnt25 = 0;
        int tmp = 0, ok = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == 50) {
                cnt25--;
                cnt50++;
                if (cnt25 < 0) // kh tra lai dc
                    ok = 1;
            } else if (a[i] == 100) {
                if (cnt50 >= 1) {
                    cnt50--;
                    cnt25--;
                } else {
                    if (cnt25 >= 3) cnt25 -= 3;
                    else ok = 1; // kh tra lai dc
                }
                if (cnt25 < 0 || cnt50 < 0) ok = 1; // kh tra lai dc

            } else cnt25++;
        }
        if (ok == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}
