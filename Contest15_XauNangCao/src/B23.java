import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String[] arr = s.split("\\s+");
        Arrays.sort(arr, (a, b) -> {
            String s1 = a.concat(b);
            String s2 = b.concat(a);
            return s2.compareTo(s1);
        });
        for (String x : arr)
            System.out.print(x);
    }
}
