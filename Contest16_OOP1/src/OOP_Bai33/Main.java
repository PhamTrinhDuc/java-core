package OOP_Bai33;

import java.util.ArrayList;
import java.util.HashMap;
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
        HashMap<String, String> map = new HashMap<>();
        map.put("CNTT", "CONG NGHE THONG TIN");
        map.put("DTVT", "DIEN TU VIEN THONG");
        map.put("KT", "KE TOAN");
        map.put("MKT", "MAKETING");
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String nganh = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN NGANH " + map.get(nganh) + " :");
            for (SinhVien x : listSinhVien) {
                if (x.getNganh().equals(nganh))
                    System.out.println(x);
            }
        }
    }
}
