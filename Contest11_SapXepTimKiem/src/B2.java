import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr, (a, b) -> {
            if (Math.abs(a - k) != Math.abs(b - k))
                return Math.abs(a - k) - Math.abs(b - k);
            return a - b;
        });
        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
        System.out.println();
        Arrays.sort(arr, (a, b) -> {
            if (a % 2 == 0 && b % 2 == 1)
                return -1;
            if (a % 2 == 0 && b % 2 == 0)
                return a - b;
            if (a % 2 == 1 && b % 2 == 1)
                return b - a;
            return 1;
        });
        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
    }
}
