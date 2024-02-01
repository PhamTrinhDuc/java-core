import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int t = sc.nextInt();
        while (t-- > 0) {
            int tt = sc.nextInt();
            if (tt == 1) {
                arr.add(sc.nextInt());
            } else {
                if (!arr.isEmpty()) arr.remove(arr.size() - 1);
            }
        }
        if (arr.isEmpty())
            System.out.println("EMPTY");
        else {
            for (int i = 0; i < arr.size(); i++)
                System.out.print(arr.get(i) + " ");
        }
    }
}
