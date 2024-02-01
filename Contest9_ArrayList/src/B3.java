import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) arr[i] = (sc.nextInt());
        Arrays.sort(arr);
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
        Arrays.sort(arr, Collections.reverseOrder());
        for (int x : arr) System.out.print(x + " ");
    }
}
