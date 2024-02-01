import javax.print.DocFlavor;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        HashMap<Character, Integer> map = new HashMap<>();
        char[] c = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] num = {1, 5, 10, 50, 100, 500, 1000};
        for (int i = 0; i < 7; i++) map.put(c[i], num[i]);
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();

        }
    }
}
