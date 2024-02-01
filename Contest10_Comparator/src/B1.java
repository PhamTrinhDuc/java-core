import javax.swing.text.html.CSS;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B1 {
    public static int countOdd(int n) {
        int cnt = 0;
        while (n != 0) {
            if (n % 10 % 2 == 1) cnt++;
            n /= 10;
        }
        return cnt;
    }

    public static int countEven(int n) {
        int cnt = 0;
        while (n != 0) {
            if (n % 10 % 2 == 0) cnt++;
            n /= 10;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr1 = new Integer[n];
        Integer[] arr2 = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
            arr2[i] = arr1[i];
        }
        Arrays.sort(arr1, (a, b) -> {
            if (countEven(a) != countEven(b))
                return countEven(a) - countEven(b);
            return a - b;
        });

        Arrays.sort(arr2, (a, b) -> countOdd(a) - countOdd(b));

        for (int i = 0; i < arr2.length; i++) System.out.print(arr1[i] + " ");
        System.out.println();
        for (int i = 0; i < arr1.length; i++) System.out.print(arr2[i] + " ");
    }

}
