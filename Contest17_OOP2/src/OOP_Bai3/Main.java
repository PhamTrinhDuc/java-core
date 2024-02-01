package OOP_Bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Help x = new Help(sc.nextLine(), sc.nextLine(), sc.nextLine());
        int q = sc.nextInt();
        while (q-- > 0) {
            x.Combat(sc);
            System.out.println(x);
        }
    }
}
