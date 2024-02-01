import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = "";
        int idx = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            idx++;
            if (idx == 4) {
                res += ",";
                idx = 1;
            }
            res += s.charAt(i);
        }
        for (int i = res.length() - 1; i >= 0; i--)
            System.out.print(res.charAt(i));
    }
}
// 28 tech java
// dsa c++
// 28tech nodejs