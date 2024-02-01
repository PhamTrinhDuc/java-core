import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// truy van tren mang

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else map.put(x, 1);
        }
        int q = sc.nextInt();
        while (q-->0){
            int tt = sc.nextInt(), x = sc.nextInt();
            if(tt==1){
                if (map.containsKey(x)) {
                    map.put(x, map.get(x) + 1);
                } else map.put(x, 1);
            }
            else if(tt==2) {
                if (map.containsKey(x)) {
                    map.put(x, map.get(x) - 1);
                    if (map.get(x) == 0) map.remove(x);
                }
            }
            else{
                if(map.containsKey(x)) System.out.println("YES");
                else System.out.println("NO");
            }
        }
//        List<Integer> arr = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            int tmp = sc.nextInt();
//            arr.add(tmp);
//        }
//
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            int tt = sc.nextInt();
//            int x = sc.nextInt();
//            if (tt == 1) {
//                arr.add(x);
//            } else if (tt == 2) {
//                arr.remove((Object) (x));
//            } else {
//                if (arr.contains(x))
//                    System.out.println("YES");
//                else
//                    System.out.println("NO");
//            }
//        }
    }
}
