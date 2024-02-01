import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B19 {
    static HashMap<String, Integer> map = new HashMap<>();
    static String transform_name(String name) {
        name = name.toLowerCase();
        String[] arr = name.split("\\s+");
        int n = arr.length;
        String res = arr[n - 1];
        for (int i = 0; i <= n - 2; i++) {
            res += arr[i].charAt(0);
        }
        map.put(res, map.getOrDefault(res, 0) + 1);
        if (map.get(res) > 1) res += "" + map.get(res);
        res += "@xyz.edu.vn";
        return res;
    }

    static String transform_birth(String birth) {
        String res = "";
        for (int i = 0; i < birth.length(); i++) {
            char c = birth.charAt(i);
            if ((i == 0 && c == '0') || (i == 3 && c == '0')) continue;
            if (Character.isDigit(c))
                res += c;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            int idx = 0;
            for (int i = 0; i < s.length(); i++) {
                if (Character.isDigit(s.charAt(i))) {
                    idx = i;
                    break;
                }
            }
            String name = s.substring(0, idx);
            String birth = s.substring(idx);
            System.out.println(transform_name(name));
            System.out.println(transform_birth(birth));
        }
    }
}
