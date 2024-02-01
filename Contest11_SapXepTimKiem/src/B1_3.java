import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class B1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        HashSet<Integer> set = new HashSet<>();
        for(int i=0 ; i<n ;i++ ) set.add(sc.nextInt());
        System.out.println(set.size());

    }
}
