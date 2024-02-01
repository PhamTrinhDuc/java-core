import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) arr.add(sc.nextInt());

        int q = sc.nextInt();
        while (q-- > 0) {
            int tt = sc.nextInt();
            int idx = sc.nextInt();
            if (tt == 1) {
                int tmp = sc.nextInt();
                arr.add(idx, tmp);
            } else {
                arr.remove(idx);
            }
        }
        if (arr.isEmpty())
            System.out.println("EMPTY");
        else {
            for (int i = 0; i < arr.size(); i++)
                System.out.print(arr.get(i) + " ");
        }
    }
}
