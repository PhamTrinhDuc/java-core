import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            int x = sc.nextInt();
            if (x % 2 == 0)
                System.out.println("EVEN");
            else
                System.out.println("ODD");

            t--;
        }
    }
}
