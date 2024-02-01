package OOP_Bai9;

import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SalaryOfTeacher x = new SalaryOfTeacher(sc.nextLine(), sc.nextLine(), sc.nextInt());
        System.out.println(x);
    }
}
