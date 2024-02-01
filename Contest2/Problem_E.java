import java.util.Scanner;
import java.lang.Math;

public class Problem_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) System.out.println("VO SO NGHIEM");
                else System.out.println("VO NGHIEM");
            } else {
                if (c==0) System.out.printf("%.2f", 0.00);
                else System.out.printf("%.2f", -c / b);
            }
        } else {
            if (b == 0) {
                if (-c / a < 0)
                    System.out.println("VO NGHIEM");
                else
                    System.out.printf("%.2f%.2f", -Math.sqrt(-c/ a) , Math.sqrt(-c/ a));
            } else {
                double delta = b * b - 4 * a * c;
                if (delta < 0)
                    System.out.println("VO NGHIEM");
                else if (delta == 0)
                    System.out.println(-b / 2 * a);
                else {
                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    if (x2 < x1 ) {
                        double tmp = x1 ;
                        x1 = x2 ; x2 = tmp ;
                    }
                    System.out.printf("%.2f %.2f", x1, x2 );
                }
            }
        }
    }
}
