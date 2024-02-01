import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tongc = 0, tongl = 0, demc = 0, deml = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x % 2 == 0) {
                demc++;
                tongc += x;
            } else {
                deml++;
                tongl += x;
            }
        }
        System.out.println(demc + "\n" + deml);
        System.out.println(tongc + "\n" + tongl);
    }
}
