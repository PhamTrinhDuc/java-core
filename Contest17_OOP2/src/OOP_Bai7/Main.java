package OOP_Bai7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String tmp = sc.nextLine();
            String cusID = sc.nextLine();
            String name = sc.nextLine();
            String discount = sc.nextLine();
            String invID = sc.nextLine();
            String amount = sc.nextLine();

            int dis = Integer.parseInt(discount.substring(11));
            double amou = Double.parseDouble(amount.substring(9, amount.length() - 2));
            int id = Integer.parseInt(cusID.substring(14));
            Customer customer = new Customer(name, id, dis);
            Invoice invoice = new Invoice(invID, amou, customer);
            invoice.amount();
        }
        Invoice.sapXepInvoice();
        for (Invoice x : Invoice.listInvoice) System.out.println(x);
    }
}
//Customer ID : 101