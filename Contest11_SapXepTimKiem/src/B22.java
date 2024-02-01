import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            while (tmp != 0) {
                set.add(tmp % 10);
                tmp /= 10;
            }
        }
        for (int x : set) System.out.print(x + " ");
    }
}
