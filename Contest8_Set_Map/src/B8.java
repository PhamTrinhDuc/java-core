import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            set.add(tmp);
        }
        int t = sc.nextInt();
        while (t-- > 0) {
            int tt = sc.nextInt();
            int x;
            if (tt == 1) {
                x = sc.nextInt();
                set.add(x);
            } else if (tt == 2) {
                x = sc.nextInt();
                if (set.contains(x))
                    // pollFirst(): xoa phan tu dau tien trong TreeSet
                    // pollLast(): xoa phan tu cuoi cung trong TreeSet
                    set.remove((Object) (x));
            } else if (tt == 3) {
                // lay ra phan tu dau tien trong TreeSet
                int first = set.first();
                System.out.println(first);
            } else {
                // lay ra phan tu cuoi cung trong TreeSet
                int end = set.last();
                System.out.println(end);
            }
        }
    }
}
