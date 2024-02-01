import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr, Collections.reverseOrder());
        long res = arr[0], cnt = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] -cnt > 0 ) {
                res = res + arr[i] - cnt;
                cnt++;
            } else break;
        }
        System.out.println(res);
    }
}
