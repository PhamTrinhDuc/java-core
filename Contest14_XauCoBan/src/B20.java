import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split("\\s+");
        TreeSet<String> set = new TreeSet<>();
        for (String x : arr) {
            StringBuilder sb = new StringBuilder(x);
            if (sb.reverse().toString().equals(x))
                set.add(x);
        }
        for (String x : set)
            System.out.print(x + " ");
    }
}
