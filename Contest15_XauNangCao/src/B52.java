import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s + "#";
        String tmp = "";
        Stack<Character> st = new Stack<>();
        st.add(s.charAt(0));
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                tmp += c;
            } else {
                if (!tmp.isEmpty()) {
                    int num = Integer.parseInt(tmp);
                    String firstElement = String.valueOf(st.pop());
                    String str = firstElement.repeat(num);
                    System.out.print(str);
                }
                st.add(c);
                tmp = "";
            }
        }
    }
}
