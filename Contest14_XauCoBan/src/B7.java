import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String digit = "";
        String string = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)))
                digit += s.charAt(i);
            else
                string += s.charAt(i);
        }
        System.out.println(digit);
        System.out.println(string);
    }
}
