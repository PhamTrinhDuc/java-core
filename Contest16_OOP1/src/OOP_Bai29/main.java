package OOP_Bai29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            SinhVien sv = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(sv);
        }

        Collections.sort(arr, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getLop().equals(o2.getLop()) == false)
                    return o1.getLop().compareTo(o2.getLop());
                return o1.getMa().compareTo(o2.getMa());
            }
        });

        for (SinhVien x : arr)
            System.out.println(x);
    }
}
