import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        if (sb.charAt(1) == '/')
            sb.insert(0, "0");
        if (sb.charAt(4) == '/')
            sb.insert(3, "0");
        System.out.println(sb);
    }
}
