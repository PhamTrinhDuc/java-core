import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(), res = "";
        // C1
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '?' || c == ',' || c == '.' || c == '!')
                res += " ";
            else res += c;
        }
        String[] arr = res.split("\\s+");
        for (String x : arr)
            System.out.print(x + " ");

//         C2: su dung lop Tokenizer
//        StringTokenizer st = new StringTokenizer(s, "!?., "); // tách các dấu "!?., "
//        while (st.hasMoreTokens()){
//            System.out.print(st.nextToken() + " ");
//        }
    }
}
