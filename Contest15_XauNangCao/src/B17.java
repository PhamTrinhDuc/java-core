import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B17 {
    static String transform_1(String[] arr) {
        String res = "";
        int n = arr.length;
        for (int i = 0; i <= n - 2; i++) {
            String x = arr[i];
            res += Character.toUpperCase(x.charAt(0)) + x.substring(1);
            if (i != n - 2) res += " ";
        }
        res += ", ";
        res += arr[n - 1].toUpperCase();
        return res;
    }

    static String transform_2(String[] arr) {
        String res = "";
        int n = arr.length;
        res += arr[n - 1].toUpperCase() + ", ";
        for (int i = 0; i < n - 1; i++) {
            res += Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1) + " ";
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        name = name.toLowerCase();
        String[] arr = name.split("\\s+");
        String name1 = transform_1(arr);
        String name2 = transform_2(arr);
        System.out.println(name1);
        System.out.println(name2);
    }
}
