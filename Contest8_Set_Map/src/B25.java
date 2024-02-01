import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            set.add(a[i]);
        }
        System.out.println(set.size());
        System.out.println(set.last() + " " + set.first());
        // xoa phan tu dau tien va cuoi cung
        set.pollFirst();
        set.pollLast();
        System.out.println(set.last() + " " + set.first());

    }
}
