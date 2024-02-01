import java.util.*;
import java.lang.*;

// [Set Map]. Bài 21. Set và kiểu char

public class B21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] c = new char[n];
        TreeSet<Character> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            c[i] = sc.next().charAt(0);
            set.add(c[i]);
        }
        System.out.println(set.size());
        for (Character x : set) System.out.print(x + " ");
        System.out.println();
        for (Character x : set.descendingSet()) System.out.print(x + " ");
    }
}
