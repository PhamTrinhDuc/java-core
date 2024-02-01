import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class B36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum = sum * 10 + c - '0';
            sum %= 4;
        }
        if (sum == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}

