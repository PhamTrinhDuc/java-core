import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt1 = 0, cnt2 = 0;
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();

            if (x % 2 == 0) {
                cnt1++;
            } else {
                cnt2++;
            }
        }

        if (cnt1 > cnt2) {
            System.out.println("CHAN");
        } else if (cnt1 == cnt2) {
            System.out.println("CHANLE");
        } else System.out.println("LE");
    }
}
// ctrl + d de dung nhap