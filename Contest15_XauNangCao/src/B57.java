import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class B57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            String ntu = sc.next();
            int ptk = sc.nextInt();
            sc.nextLine();
            map.put(ntu, ptk);
        }
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            StringBuilder sb = new StringBuilder(s);
            sb.append('#');
            Vector<String> v = new Vector<>();
            String tmp = "";
            for (char c : sb.toString().toCharArray()) {
                if (Character.isDigit(c)) {
                    tmp += c;
                } else {
                    if (!tmp.isEmpty()) v.add(tmp);
                    tmp = "";
                }
            }
            sb = sb.deleteCharAt(sb.length() - 1);
            String strNew = s.replaceAll("[0-9]", " ");
            String[] arr = strNew.split("\\s+");
            long sum = 0;
            for (int i = 0; i < arr.length; i++) {
                String nguyenTu = arr[i];
                String phantuKhoi = v.get(i);
//                System.out.println(nguyenTu + " " + phantuKhoi);
                sum += Long.parseLong(phantuKhoi) * map.get(nguyenTu);
            }
            System.out.println(sum);
        }
    }
}
