import java.io.*;
import java.lang.constant.DynamicConstantDesc;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B6 {
    public static int countOdd(int n) {
        int cnt = 0;
        while (n != 0) {
            if (n % 2 == 1) cnt++;
            n /= 10;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            arr.add(tmp);
        }
        Collections.sort(arr, (a, b) -> {
            if (countOdd(a) != countOdd(b))
                return countOdd(b) - countOdd(a);
            return a - b;
        });
        for (int i = 0; i < n; i++)
            System.out.print(arr.get(i) + " ");
    }
}
