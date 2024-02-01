import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            System.out.print((long) i * i + ' ');
        }
    }
}
