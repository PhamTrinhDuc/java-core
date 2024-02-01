import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B32 {
    static boolean NT(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return n > 1;
    }

    static boolean check(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            if (!NT(c - '0')) return false;
            sum += c - '0';
        }
        return NT(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (check(s)) System.out.println("YES");
        else System.out.println("NO");
    }
}
