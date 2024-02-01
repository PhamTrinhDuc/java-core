import java.util.Arrays;
import java.util.Scanner;

public class B3 {
    public static int SumDigit(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr, (a, b) -> {
            if (SumDigit(a) != SumDigit(b))
                return SumDigit(a) - SumDigit(b);
            return a - b;
        });
        for (int x : arr) System.out.print(x + " ");
    }
}
