import java.util.Scanner;
import java.lang.Math;
import java.lang.Character;
import java.lang.String;
import java.io.*;
import java.util.*;

public class B37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int GioHienTai = ((m + k )/28 + h ) % 28 ;
        int PhutHienTai = (m + k ) % 28 ;
        System.out.printf("%02dh:%02dm", GioHienTai, PhutHienTai);

    }
}
