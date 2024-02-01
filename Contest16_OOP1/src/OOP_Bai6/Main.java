package OOP_Bai6;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rentange x = new Rentange(sc.nextInt(), sc.nextInt(), sc.next());
        if (!x.check()) System.out.println("INVALID");
        else System.out.println(x);
    }
}
