import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B7 {
    public static int SortDigit(int n) {
        int cnt = 0;
        while (n != 0) {
            if (n % 10 == 0 || n % 10 == 6 || n % 10 == 8) cnt++;
            n /= 10;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        Collections.sort(arr, (a, b) -> {
            if (SortDigit(a) != SortDigit(b))
                return SortDigit(b) - SortDigit(a);
            return a - b;
        });

        for (int i = 0; i < n; i++)
            System.out.print(arr.get(i) + " ");
    }
}
