import java.util.Scanner;

public class B19 {
    public static int Check(long n) {
        if (n == 0) return 1;
        if(n%2==1) return 0;
        return Check(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(Check(n)==1)
            System.out.println("YES");
        else System.out.println("NO");
    }
}
