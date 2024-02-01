import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        long m = sc.nextLong();
        long sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum = (sum * 10 + n.charAt(i) - '0');
            sum %= m;
        }
        System.out.println(sum);
    }
}
