import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B16 {
    static String transform_name(String name) {
        String[] arr = name.split("\\s+");
        String res = "";
        for (String x : arr) {
            res += Character.toUpperCase(x.charAt(0)) + x.substring(1) + " ";
        }
        return res;
    }

    static String transform_birth(String birth) {
        StringBuilder sb = new StringBuilder(birth);
        if (sb.charAt(1) == '/') sb.insert(0, "0");
        if (sb.charAt(4) == '/') sb.insert(3, "0");
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String birth = sc.nextLine();
        name = name.toLowerCase();
        name = transform_name(name);
        birth = transform_birth(birth);
        System.out.println(name);
        System.out.println(birth);
    }
}
