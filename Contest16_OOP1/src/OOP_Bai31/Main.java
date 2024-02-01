package OOP_Bai31;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> listSinhVien = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            SinhVien sv = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            listSinhVien.add(sv);
        }
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String cls = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + cls + " :");
            for (SinhVien x : listSinhVien) {
                if (x.getLop().equals(cls))
                    System.out.println(x);
            }
        }

    }
}
