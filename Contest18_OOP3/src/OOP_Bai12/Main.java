package OOP_Bai12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<Student> listStudent = new ArrayList<>();
        ArrayList<Staff> listStaff = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String tmp = sc.nextLine();
            String name = sc.nextLine();
            String add = sc.nextLine();
            String nganhHoc = sc.nextLine();
            int namHoc = sc.nextInt();
            double hocPhi = sc.nextDouble();
            Student student = new Student(name, add, nganhHoc, namHoc, hocPhi);
            listStudent.add(student);
        }

        for (int i = 0; i < m; i++) {
            sc.nextLine();
            String tmp = sc.nextLine();
            String name = sc.nextLine();
            String add = sc.nextLine();
            String school = sc.nextLine();
            double salary = sc.nextDouble();
            Staff staff = new Staff(name, add, school, salary);
            listStaff.add(staff);
        }
        Collections.sort(listStudent);
        Collections.sort(listStaff);
        System.out.println("Student List :\n-----------------");
        for (Student x : listStudent) System.out.println(x);
        System.out.println("Staff List :\n-----------------");
        for (Staff x : listStaff) System.out.println(x);
    }
}
