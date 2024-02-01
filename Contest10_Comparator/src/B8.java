import javax.swing.text.html.CSS;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B8 {
    public static int CountPrime(int n) {
        int cnt = 0;
        while (n != 0) {
            int tmp = n % 10;
            if (tmp == 2 || tmp == 3 || tmp == 5 || tmp == 7) cnt++;
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
        Collections.sort(arr, (a, b) -> CountPrime(b) - CountPrime(a));
        for (int i = 0; i < n; i++)
            System.out.print(arr.get(i) + " ");
    }
}
