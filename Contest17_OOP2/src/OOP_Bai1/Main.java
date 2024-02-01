package OOP_Bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            AccountClass acc = new AccountClass(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        int q = sc.nextInt();
        sc.nextLine();
        while (q-- > 0) {
            String username = sc.nextLine();
            String password = sc.nextLine();
            boolean check = false;
            for (AccountClass x : AccountClass.listAccount) {
                if (x.getUsername().equals(username) && x.getPass().equals(password))
                    check = true;
            }
            if (check) System.out.println("Login Sucsessful");
            else System.out.println("Login Failed");
        }
    }
}
