import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split("\\s+");
        int cnt = 0;
        for (String x : arr) {
            if (x.toLowerCase().equals("28tech"))
                cnt++;
        }
        System.out.println(cnt);
    }
}
