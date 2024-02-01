package OOP_Bai5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String tenSach = sc.nextLine();
            double giaBan = sc.nextDouble();
            int soLuong = sc.nextInt();
            sc.nextLine();
            String tenTG = sc.nextLine();
            String mail = sc.nextLine();
            String gender = sc.nextLine();

            Author author = new Author(tenTG, mail, gender);
            Book book = new Book(tenSach, author, giaBan, soLuong);
        }
        Book.sapXep();
        for (Book x : Book.listBook) {
            System.out.println(x);
        }
    }
}
