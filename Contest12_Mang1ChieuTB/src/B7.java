import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr, (a, b) -> {
            if (a % 2 == 1 && b % 2 == 0)
                return -1;
            if (a % 2 == 1 && b % 2 == 1)
                return b - a;
            if (a % 2 == 0 && b % 2 == 0)
                return a - b;
            return 1;
        });
        for (int x : arr) System.out.print(x + " ");
    }
}
