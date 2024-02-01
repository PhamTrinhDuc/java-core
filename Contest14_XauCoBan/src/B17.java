import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        TreeSet<String> set = new TreeSet<>();
        String[] arr = s.split("\\s+");
        for (String x : arr) set.add(x);
        for (String x : set)
            System.out.print(x + " ");
        System.out.println();
        for (String x : set.descendingSet())
            System.out.print(x + " ");
    }
}
