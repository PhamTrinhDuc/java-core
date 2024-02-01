import java.awt.*;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B1 {
    public static int CountEven(int x) {
        int cnt = 0;
        while (x != 0) {
            if (x % 2 == 0) cnt++;
            x /= 10;
        }
        return cnt;
    }
    public static int CountOdd(int x) {
        int cnt = 0;
        while (x != 0) {
            if (x % 2 == 1) cnt++;
            x /= 10;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        Integer[] save = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            save[i] = arr[i];
        }
        Arrays.sort(arr, (a, b) -> {
            if(CountEven(a) != CountEven(b))
                return CountEven(a) - CountEven(b);
            return a- b;
        });
        Arrays.sort(save, (a, b) ->CountOdd(a) - CountOdd(b));
        for(int i=0 ; i<n ; i++ ) System.out.print(arr[i] + " ");
        System.out.println();
        for(int i=0 ; i<n ; i++ ) System.out.print(save[i] + " ");
    }
}
