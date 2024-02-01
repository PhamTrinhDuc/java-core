import java.util.Scanner;

public class B8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long tich = 1;
        int mod = (int) (1e9);
        for (int i = 1; i <= n; i++) {
            tich = (tich * i % mod) % mod;
            System.out.println(tich);
        }
    }
}