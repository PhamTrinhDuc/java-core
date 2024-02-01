import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String res = "";
        for (int i = 0; i < n; i++) {
            char c = sc.next().charAt(0);
            res += c;
        }
        System.out.println(res);
    }
}
