import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), ok = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x == 2022) {
                System.out.println("YES");
                ok = 1;
                break;
            }
        }
        if (ok == 0)
            System.out.println("NO");
    }
}
