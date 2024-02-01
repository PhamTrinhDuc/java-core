import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            int cnt = 0;
            HashMap<Character, Integer> map = new HashMap<>();
            String s = sc.nextLine();
            for (char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            boolean ok = true;
            for (char c : s.toCharArray()) {
                if (map.get(c) % 2 == 1) cnt++;
//                System.out.println(map.get(c));
                if (cnt > 1) {
                    ok = false;
                    break;
                }
            }
            if (ok) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
