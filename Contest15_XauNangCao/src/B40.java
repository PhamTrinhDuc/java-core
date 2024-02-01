import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0, haiMu = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            sum += (s.charAt(i) - '0') * haiMu;
            sum %= 5;

            haiMu *= 2;
            haiMu %= 5;
        }
        if (sum == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}
