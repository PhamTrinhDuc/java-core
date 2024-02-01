import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.length() % 2 == 0)
            System.out.println("NOT FOUND");
        else
            System.out.println(s.charAt(s.length() / 2));
    }
}
