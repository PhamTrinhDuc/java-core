import java.util.Scanner;

public class B20 {
    public static int CountOperation(int n) {
        int t1 = (int) 1e9, t2 = (int) 1e9, t3 = (int) 1e9;
        if (n == 1) return 0;
        if (n % 2 == 0) t1 = 1 + CountOperation(n / 2);
        if (n % 3 == 0) t2 = 1 + CountOperation(n / 3);
        t3 = 1 + CountOperation(n - 1);
        return Math.min(t1, Math.min(t2, t3));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(CountOperation(n));
    }
}
