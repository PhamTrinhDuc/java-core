import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        BigInteger num = new BigInteger("" + 4);
        int mod = Integer.parseInt(n.mod(num).toString());
        if (n.toString().equals("0")) System.out.println(1);
        else if (mod == 1) System.out.println(8);
        else if (mod == 2) System.out.println(4);
        else if (mod == 3) System.out.println(2);
        else System.out.println(6);
    }
}
