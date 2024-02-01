import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        StringBuilder sb = new StringBuilder(s);
        sb.insert(k, "28tech");
        System.out.println(sb);
    }
}
