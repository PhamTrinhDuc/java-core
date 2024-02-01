import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split("\\s+");
        HashSet<String> set = new HashSet<>();
        for (String x : arr) {
            if (set.add(x.toLowerCase()));
        }
        System.out.println(set.size());
    }
}
