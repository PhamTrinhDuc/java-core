package OOP_Bai34;

import java.util.Scanner;
import java.util.SequencedCollection;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            GiangVien gv = new GiangVien(sc.nextLine(), sc.nextLine(), i);
        }
        GiangVien.sapXepGV();
        GiangVien.inDanhSach();
    }
}
