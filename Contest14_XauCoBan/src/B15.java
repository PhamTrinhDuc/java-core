import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split("\\s+");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1) {
                StringBuilder sb = new StringBuilder(arr[i]);
                System.out.print(sb.reverse() + " ");
            } else System.out.print(arr[i] + " ");
        }

    }
}
