import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int tmp = i;
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    System.out.print((char) (tmp + 65));
                    tmp++;
                } else {
                    System.out.print((char) (tmp + 97));
                    tmp++;
                }
            }
            System.out.println();
        }
    }
}
